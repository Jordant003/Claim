import React from 'react'
import '../../css/main-content.css'

function MainContent(props) {
  return (
    <div className='flex-row main-content bg-img'>
        {props.children}
    </div>
  )
}

export default MainContent