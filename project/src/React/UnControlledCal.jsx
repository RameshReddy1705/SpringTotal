import { useRef, useState } from "react"

const UnControlledCal=()=>{
    let num1=useRef()
    let num2=useRef()
    let [result,setResult]=useState(0)

    let add=()=>{
        let a=Number(num1.current.value)
        let b=Number(num2.current.value)
        setResult(a+b)
    }
    let sub=()=>{
        let a=Number(num1.current.value)
        let b=Number(num2.current.value)
        setResult(a-b)
    }
    let mul=()=>{
        let a=Number(num1.current.value)
        let b=Number(num2.current.value)
        setResult(a*b)
    }
    return(
        <div>
            <label htmlFor="">Num-1</label>
            <input type="text" ref={num1} />
            <label htmlFor="">Num-2</label>
            <input type="text" ref={num2} />
            <button onClick={add}>Add  +</button>
            <button onClick={sub}>Sub  -</button>
            <button onClick={mul}>Mult  *</button>

            <h1>{result}</h1>
        </div>
    )
}
export default UnControlledCal