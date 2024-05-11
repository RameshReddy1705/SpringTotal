import { useState } from "react"

const UseState1 =()=>{
    let[name,setName]=useState("Mounika")
    let dg=()=>{
        setName(24356)
    }
    return(
        <div>
         <h1>{name}</h1>
         <button onClick={dg}>submit</button>
        </div>
    )
}
export default UseState1