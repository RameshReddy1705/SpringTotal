
import { useEffect, useState } from "react"

const SideEffect=()=>{
    let [count, setCount]=useState(0)
    let [count1,setCount1]=useState(0)
    //useEffect

    useEffect(()=>{
        // alert("Component is loaded")
        console.log("component is rendered")
    },[count])

    return(
        <div>
            {count}
        <button onClick={()=>{setCount(count+1)}}>Increment</button>
        <button onClick={()=>{setCount(count-1)}}>Decrement</button>
        <button onClick={()=>{setCount(count =0)}}>Reset</button>
        <br /><br />
        <button onClick={()=>{setCount1(count1+2)}}>Incre 2</button>
        </div>
    )
}
export default SideEffect