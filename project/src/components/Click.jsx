import React from "react"
import Hoc from "./Hoc"
const Click=(x)=>{
    console.log(x)
    return(
        <div>
            {x.data}
            <button onClick={x.Func}>Increment Click</button>

        </div>
    )
}
export default Hoc(Click)