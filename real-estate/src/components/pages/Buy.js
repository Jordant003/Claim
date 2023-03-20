import axios from 'axios'
import React, { useState, useEffect } from 'react'
import PropertyBox from '../reusables/PropertyBox'
import Modal from '../reusables/Modal'


function Buy(props) {

    const [isLoading, setIsLoading] = useState(true)
    const [activeProperty, setActiveProperty] = useState({})

    useEffect(() => {
        if (props.properties.length === 0) {
            axios.get('http://localhost:8080/property/findAll')
                .then((response) => {
                    props.setProperties(response.data)
                    setIsLoading(false)
                })
                .catch((e) => {
                    console.log(e)
                })
        }

    }, [])



    const openModal = (e) => {
        axios.get(`http://localhost:8080/property/findById/${e.target.id}`)
            .then((response) => {
                console.log(response.data)
                setActiveProperty(response.data)


            })
            .catch((e) => {
                console.log(e)
            })

        props.setIsModalOpen(true)

    }

    const renderContent = () => {
        return (
            <div>
                {props.properties.map((property) => (
                    <PropertyBox property={property} onClick={openModal} />
                ))}
            </div>
        )
    }

    const buyProperty = (e) => {
        const propertyId = e.target.value

        axios.post(`http://localhost:8080/user/buyProperty/${propertyId}`, props.user, activeProperty)
            .then((response) => {
                setActiveProperty(response.data)
            })
            .catch((e) => {
                console.log(e)
            })
    }

    const renderModal = () => {
        if (props.isModalOpen === true && props.user.id !== undefined) {
            return (
                <Modal title={"NEW HOUSE"} setIsModalOpen={props.setIsModalOpen} buyProperty={buyProperty}>
                    <div className='flex-col'>
                        <div className='flex-col'>
                            <img className='img' src={activeProperty.image} alt='' />
                            <br /> Price: ${activeProperty.price}
                            <br /> {activeProperty.bedrooms} bds | {activeProperty.bathrooms} baths | {activeProperty.sqft} sqft
                            <br />{activeProperty.streetNumber} {activeProperty.street}, {activeProperty.city}, {activeProperty.state} {activeProperty.zipCode}
                        </div>
                        <br></br>
                        <div>{activeProperty.description}</div>
                        <button className='buy-button' onClick={buyProperty}>BUY</button>
                    </div>
                </Modal>

            )
        } else if (props.isModalOpen) {
            return (
                <Modal title={"NEW HOUSE"} setIsModalOpen={props.setIsModalOpen} buyProperty={buyProperty}>
                    <div className='flex-col'>
                        <div className='flex-col'>
                            <img className='img' src={activeProperty.image} alt='' />
                            <br /> Price: ${activeProperty.price}
                            <br /> {activeProperty.bedrooms} bds | {activeProperty.bathrooms} baths | {activeProperty.sqft} sqft
                            <br />{activeProperty.streetNumber} {activeProperty.street}, {activeProperty.city}, {activeProperty.state} {activeProperty.zipCode}
                        </div>
                        <br></br>
                        <div>{activeProperty.description}</div>
                    </div>
                </Modal>
            )
        }
    }


    return (

        <div>
            {renderContent()}
            {renderModal()}
        </div>


    )
}

export default Buy