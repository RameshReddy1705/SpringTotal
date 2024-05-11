import { useState } from "react"

const Controlled=()=>{
    let [name, setname]=useState("")
    let [email, setemail]=useState("")
    let [sal, setsal]=useState("")

    let namedata=(e)=>{
        setname(e.target.value)
    }
    let emaildata=(b)=>{
        setemail(b.target.value)
    }
    let saldata=(a)=>{
        setsal(a.target.value)
    }
    let change=()=>{
        console.log(name, email, sal);
        document.write(name, email , sal)
    }

    return(
        <div>
            <label htmlFor="">Name</label>
            <input type="text" value={name} onChange={namedata}/>
            <label htmlFor="">Email</label>
            <input type="email" value={email} onChange={emaildata}/>
            <label htmlFor="">Salary</label>
            <input type="text" value={sal} onChange={saldata}/>

            <button onClick={change}>Submit</button>
        </div>
    )
}
export default Controlled