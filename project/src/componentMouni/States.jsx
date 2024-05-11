import { useState } from "react"

const States=()=>{
    let[count,setCount]=useState(0)
    let incre=()=>{
        setCount(count+1)
    }
    // let[key,setKey]=useState(0)
    // let inc=()=>{setKey(key+1)}
    // let dec=()=>{setKey(key-1)}
    // let reset=()=>{setKey(0)}
    return(
        <div>
            {/* {key}
            <button onClick={inc}> increment</button>
            <button onClick={dec}> decrerment</button>
            <button onClick={reset}>reset</button> */}
            <i class="fa-solid fa-heart" onClick={incre}></i><sup>{count}</sup>
        </div>
    )
}
export default States