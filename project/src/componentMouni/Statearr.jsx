import { useState } from "react"
const Statearr=()=>{
    let[arr,setArr]=useState(["Hellow",15,"Good morning"])
    return(
        <div>
            <h1>{arr[0]}</h1>
            <h1>{arr[1]}</h1>
            <h1>{arr[2]}</h1>
        </div>
    )
}
export default Statearr