import { useState } from "react"

const US=()=>{
    let[name,setName]=useState("12365")
    let kl=()=>{setName("ramesh")}
    return(
        <div >
          <h1>{name}</h1>
          <button onClick={kl}>submit</button>
        </div>
    )
}
export default US