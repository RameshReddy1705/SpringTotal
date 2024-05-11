import { useRef } from "react"

const Reference=()=>{
    let dataref= useRef()
    console.log(dataref)
    let color=()=>{
        dataref.current.style.color="red"
        // dataref.current.style.backgroundcolor="black"
        // dataref.current.style.color="Whilte"
    }
    return(
        <div>
            <h1 ref={dataref}>Ramesh Reddy</h1>
            <button onClick={color}>Change</button>
        </div>
    )
}
export default Reference