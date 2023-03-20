import axios from 'axios';
import { useEffect, useState } from 'react';
import { Route, Routes } from 'react-router';
import './App.css';
import Home from './components/pages/Home';
import SignIn from './components/pages/SignIn';
import SignUp from './components/pages/SignUp';
import PageWrapper from './components/reusables/PageWrapper';
import Buy from './components/pages/Buy';
import Agent from './components/pages/Agent';

function App() {

  const [properties, setProperties] = useState([])
  const [isModalOpen, setIsModalOpen] = useState(false)
  

  const [user, setUser] = useState({
    email: "",
    password: "",
    name: "",
    phoneNumber: ""
  })

  useEffect(() => {
    const email = localStorage.getItem("email")
    axios.get(`http://localhost:8080/user/getUserByEmail/${email}`)
      .then((response) => {
        setUser(response.data)
      })
      .catch((e) => {
        console.log(e)
      })
  }, [])

  return (
    <PageWrapper
      user={user} setUser={setUser} setProperties={setProperties}>
      <Routes>
        <Route path='/' element={<Home user={user}  />} />
        <Route path='/Agent' element={<Agent user={user} />} />
        <Route path='/Buy' element={<Buy user={user} properties={properties} 
          setProperties={setProperties} isModalOpen={isModalOpen} setIsModalOpen={setIsModalOpen}/>} />
        <Route path='/SignIn' element={<SignIn user={user} setUser={setUser} />} />
        <Route path='/SignUp' element={<SignUp user={user} setUser={setUser} />} />
      </Routes>
    </PageWrapper>

  )
}

export default App;
