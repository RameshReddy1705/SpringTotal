import { useState } from "react"

const StatesArray=()=>{
    let [Array]=useState(["Ramesh","Reddy"])
    return(
        <div>
            <h1>{Array[0]}</h1>
            <h1>{Array[1]}</h1>
        </div>
    )
}
export default StatesArray