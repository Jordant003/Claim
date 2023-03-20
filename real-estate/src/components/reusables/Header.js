
import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router';
import PropertyBox from './PropertyBox';
import Select from "react-dropdown-select";



function Header(props) {

  const [bathroomCounter, setbathroomCount] = useState(0)
  const [searchCity, setSearchCity] = useState('')
  const [prices, setPrices] = useState({
    lowerPrice: 0,
    greaterPrice: 0
  })

  const options = [
    {
      value: 1,
      label: "500"
    },
    {
      value: 2,
      label: "1000"
    },
    {
      value: 3,
      label: "1250"
    },
    {
      value: 4,
      label: "1500"
    }
  ];

  const priceOptions = [
    {
      value: 1,
      label: "0"
    },
    {
      value: 2,
      label: "100000"
    },
    {
      value: 3,
      label: "200000"
    },
    {
      value: 4,
      label: "300000"
    },
    {
      value: 5,
      label: "400000"
    },
    {
      value: 6,
      label: "500000"
    },
  ]

  function submitCityHandler() {
    axios.get(`http://localhost:8080/property/findByCity/${searchCity}`)
      .then((response) => {
        console.log(response)
        props.setProperties(response.data)
        navigator("/buy")
      })
      .catch((e) => {
        console.log(e)
      })
  }

  function submitBathroomHandler() {
    axios.get(`http://localhost:8080/property/findByBathrooms/${bathroomCounter}`)
      .then((response) => {
        console.log(response)
        props.setProperties(response.data)
        navigator("/buy")
      })
      .catch((e) => {
        console.log(e)
      })
  }

  function submitSqftHandler(label) {
    axios.get(`http://localhost:8080/property/findBySqFt/${label}`)
      .then((response) => {
        console.log(response)
        props.setProperties(response.data)
        navigator("/buy")
      })
      .catch((e) => {
        console.log(e)
      })
  }

  function submitPriceHandler() {
    axios.get(`http://localhost:8080/property/findByPrice/${prices.lowerPrice}/${prices.greaterPrice}`)
      .then((response) => {
        console.log(response)
        props.setProperties(response.data)
        navigator("/buy")
      })
      .catch((e) => {
        console.log(e)
      })
  }
  const navigator = useNavigate()

  const signOut = () => {
    localStorage.removeItem("email")
    props.setUser({
      email: "",
      password: "",
      name: "",
      phoneNumber: ""
    })
    navigator("/")
  }

  const onChange = (e) => {

    submitSqftHandler(e[0].label)

  }

  const onChangeLowPrice = (e) => {

    const tempPrice = { ...prices }
    tempPrice['lowerPrice'] = e[0].label
    setPrices(tempPrice)

  }

  const onChangeGreaterPrice = (e) => {

    const tempPrice = { ...prices }
    tempPrice['greaterPrice'] = e[0].label
    setPrices(tempPrice)

  }

  const renderHeader = () => {
    if (props.user.id === undefined) {
      return (
        <div className='header flex-col'>
          <div className='header-top flex-row'>
            <div className="third-width">
              <a href="/buy" className="links">Buy</a>
            </div>
            <div className="third-width">
              <h2>ARCH <img className='arch-img' src='https://i.pinimg.com/originals/cf/2e/66/cf2e6684b6d1e853ce8adb0990a49a2b.gif'></img>REALTY</h2>
            </div>
            <div className="third-width">
              <a href="/SignIn" className="links">Sign In</a>
              <a href="/" className="links">Home</a>
              <a href="/SignUp" className="links">Sign Up</a>
            </div>
          </div>
          <div className='header-bottom flex-row'>
            <div className='third-width'>
              <input className='search-bar' value={searchCity} onChange={(e) => setSearchCity(e.target.value)} placeholder='Search by City' />
              <button className='search-button' onClick={submitCityHandler}>ENT</button>
            </div>
            <div className='half-width bathroom-box'>
              <div>
                <h3>Bathrooms:</h3>
                <button className='bathroom-button flex-row' onClick={() => setbathroomCount((prevCount) => prevCount - .5)}>-</button>
                <input className='bathroom-input' type='number' value={bathroomCounter} onChange={(e) => setbathroomCount(e.target.value)} />
                <button className='bathroom-button flex-row' onClick={() => setbathroomCount((prevCount) => prevCount + .5)}>+</button>
                <button className='searchbath-button' onClick={submitBathroomHandler}>ENT</button>
              </div>
            </div>
            <div className='sqft-box boxes'>
              <h3>Square Feet: <Select className='sqft-selector' options={options} onChange={onChange} /></h3>
            </div>
            <div className='price-box boxes'>
              <div>
                <h3>Price:</h3>
                <Select className='price-selector' options={priceOptions} onChange={onChangeLowPrice} /> -
                <Select className='price-selector' options={priceOptions} onChange={onChangeGreaterPrice} />
                <button className='price-button' onClick={submitPriceHandler}>ENT</button>
              </div>
            </div>
          </div>
        </div>
      )
    } else {
      return (
        <div className='header flex-col'>
          <div className='header-top flex-row'>
            <div className="third-width">
              <a href="/buy" className="links">Buy</a>
            </div>
            <div className="third-width">
              <h3 className='welcome'>Welcome</h3>
              <h2>ARCH<img className='arch-img' src='https://i.pinimg.com/originals/cf/2e/66/cf2e6684b6d1e853ce8adb0990a49a2b.gif'></img>REALTY</h2>
              <h3 className='user-logo'>{props.user.name.charAt(0).toUpperCase()}</h3>
            </div>
            <div className="third-width">
              <a href="/" className="links">Home</a>
              <button href="/" onClick={signOut} className="links">Sign Out</button>
            </div>
          </div>
          <div className='header-bottom flex-row'>
            <div className='third-width'>
              <input className='search-bar' value={searchCity} onChange={(e) => setSearchCity(e.target.value)} placeholder='Search by City' />
              <button className='search-button' onClick={submitCityHandler}>ENT</button>
            </div>
            <div className='third-width bathroom-box'>
              <div>
                <h3>Bathrooms:</h3>
                <button className='bathroom-button flex-row' onClick={() => setbathroomCount((prevCount) => prevCount - .5)}>-</button>
                <input className='bathroom-input' type='number' value={bathroomCounter} onChange={(e) => setbathroomCount(e.target.value)} />
                <button className='bathroom-button flex-row' onClick={() => setbathroomCount((prevCount) => prevCount + .5)}>+</button>
                <button className='searchbath-button' onClick={submitBathroomHandler}>ENT</button>
              </div>

            </div>
            <div className='sqft-box boxes'>
              <h3>Square Feet: <Select className='sqft-selector' options={options} onChange={onChange} /></h3>
            </div>
            <div className='price-box boxes'>
              <div>
                <h3>Price:</h3>
                <Select className='price-selector' placeholder='MIN' options={priceOptions} onChange={onChangeLowPrice} /> -
                <Select className='price-selector' placeholder='MAX ' options={priceOptions} onChange={onChangeGreaterPrice} />
                <button className='price-button' onClick={submitPriceHandler}>ENT</button>
              </div>
            </div>
          </div>
        </div>

      )
    }
  }

  return (
    renderHeader()
  )
}

export default Header