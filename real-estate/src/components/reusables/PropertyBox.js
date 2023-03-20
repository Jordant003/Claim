import React from 'react'

function PropertyBox(props) {
  return (
    <div className='flex-col property-box'>
        <div className='flex-col'>
            <img className='property-img' src={props.property.image} alt='' id={props.property.id} onClick={props.onClick} />
            <br/> Price: ${props.property.price}
            <br/> {props.property.bedrooms} bds | {props.property.bathrooms} baths | {props.property.sqft} sqft
            <br/>{props.property.streetNumber} {props.property.street}, {props.property.city}, {props.property.state} {props.property.zipCode}
        </div>
    </div>
  )
}

export default PropertyBox