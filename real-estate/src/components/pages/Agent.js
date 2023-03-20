import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router'

function Agent() {

    const navigator = useNavigate()

    const [property, setProperty] = useState({
        streetNumber: null,
        street: "",
        city: "",
        state: "",
        zipCode: null,
        sqft: null,
        rooms: null,
        bathrooms: null,
        description: "" ,
        price: null,
        image: ""
    })

    const changeHandler = (event) => {
        console.log(event)
        const name = event.target.name;
        const value = event.target.value;
        const tempProperty = { ...property };
        tempProperty[name] = value;
        setProperty(tempProperty)
      }

    const clickHandler = () => {
        axios.post('http://localhost:8080/property/create', property)
        .then((response) => {
            navigator('/')
        })
        .catch((e) => {
            console.log(e)
        })
    }

  return (
    <div className='flex-col'>
      <input placeholder='Street Number' onChange={changeHandler} value={property.streetNumber} type='number' name='streetNumber' />
      <input placeholder='Street' onChange={changeHandler} value={property.street} type='text' name='street' />
      <input placeholder='City' onChange={changeHandler} value={property.city} type='text' name='city' />
      <input placeholder='State' onChange={changeHandler} value={property.state} type='text' name='state' />
      <input placeholder='Zip Code' onChange={changeHandler} value={property.zipCode} type='number' name='zipCode' />
      <input placeholder='Sqft' onChange={changeHandler} value={property.sqft} type='number' name='sqft' />
      <input placeholder='Rooms' onChange={changeHandler} value={property.rooms} type='number' name='rooms' />
      <input placeholder='Bathrooms' onChange={changeHandler} value={property.bathrooms} type='number' name='bathrooms' />
      <input placeholder='Description' onChange={changeHandler} value={property.description} type='text' name='description' />
      <input placeholder='$ Price' onChange={changeHandler} value={property.price} type='number' name='price' />
      <input placeholder='Image' onChange={changeHandler} value={property.image} type='text' name='image' />
      <button onClick={clickHandler} >Submit</button>
    </div>
  )
}

export default Agent