import { useState } from "react"

const States=()=>{
    let[data,setData]=useState("Ramesh Reddy")
    let Reddy=()=>{
        setData("Siva Reddy")
    }
    return(
        <div>
            <h1>{data}</h1>
            <button onClick={Reddy}>Change</button>
        </div>
    )
}
export default States