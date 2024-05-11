import { useState } from "react"

const Contr=()=>{
    let[name,setName]=useState("");
    let[email,setEmail]=useState("");
    let[pass,setPass]=useState("");

    let nameData=(e)=>{
        // console.log(e);
        // console.log(e.target);
        // console.log(e.target.value);
        setName(e.target.value)
    }

    let emailData=(e)=>{
        setEmail(e.target.value)
    }
    
    let passData=(e)=>{
        setPass(e.target.value)
    }


    let safeHandle=(e)=>{
        e.preventDefault()
        console.log(name,email,pass);
    }


    return(
        <div>
            <label htmlFor="">Name</label>
            <input type="text"  value={name} onChange={nameData}/>
            <br />
            <br />
            <label htmlFor="">Email</label>
            <input type="text" value={email}  onChange={emailData}/>
            <br />
            <br />
            <label htmlFor="">Password</label>
            <input type="text" value={pass}  onChange={passData}/>
            <button onClick={safeHandle}>Submit</button>
        </div>
    )
} 
export default Contr
