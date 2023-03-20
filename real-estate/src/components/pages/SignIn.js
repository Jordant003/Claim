import axios from 'axios';
import React from 'react'
import { useNavigate } from 'react-router';

function SignIn(props) {

  const navigator = useNavigate()

    const changeHandler = (event) => {
        console.log(event)
        const name = event.target.name;
        const value = event.target.value;
        const tempUser = { ...props.user };
        tempUser[name] = value;
        props.setUser(tempUser)
      }

    const clickHandler = () => {
        axios.post('http://localhost:8080/user/login', props.user)
        .then((response) => {
          localStorage.setItem("email", response.data.email)
          props.setUser(response.data)
          if(response.data.isAgent === true) {
            navigator('/agent')
          } else {
          navigator('/')
          }

        })
        .catch((e) => {
          console.log(e)
        })
    }

  return (
    <div className='flex-col'>
      <div>Email</div>
      <input placeholder='Email' onChange={changeHandler} value={props.user.email} type='text' name='email' />
      <div>Password</div>
      <input placeholder='Password' onChange={changeHandler} value={props.user.password} type='password' name='password' />

      <button onClick={clickHandler} >Submit</button>
    </div>
  )
}

export default SignIn