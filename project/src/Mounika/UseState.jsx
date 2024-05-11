import { useState } from "react"

const UseState=()=>{ 
    let [n, setN]=useState("Mounika") 
    let ch=()=>{
        setN("Ramesh")
    }
    return(
        <div>
            <h1>{n}</h1>
            <button onClick={ch}>Submit</button>
        </div>
    )
}
export default UseState