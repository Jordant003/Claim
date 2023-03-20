import React, { useState } from 'react'
import '../../css/modal.css'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faX } from '@fortawesome/free-solid-svg-icons'
import PropertyBox from './PropertyBox'


function Modal(props) {

    const closeModal = () => {
        props.setIsModalOpen(false)
    }


    return (
        <div className='modal-background'>
            <div className='modal flex-col'>
                <div className='modal-header'>
                    <h1 className='center'>{props.title}</h1>
                    <FontAwesomeIcon icon={faX} className="x-close" onClick={closeModal} />
                </div>
                <div className='modal-body'>
                    {props.children}
                </div>

            </div>
        </div>
    )
}

export default Modal