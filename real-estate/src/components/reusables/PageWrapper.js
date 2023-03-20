import React from 'react'
import Header from './Header'
import MainContent from './MainContent'

function PageWrapper(props) {
  return (
    <div className='flex-col page'>
        <Header user={props.user} setUser={props.setUser} setProperties={props.setProperties}/>
        <MainContent>
          {props.children}
        </MainContent>
    </div>
  )
}

export default PageWrapper