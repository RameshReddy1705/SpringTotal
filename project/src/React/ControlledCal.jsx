import { useState } from "react"

const ControlledCal=()=>{
    let [num1, setnum1]=useState("")
    let [num2, setnum2]=useState("")
    let [result, setResult]=useState(0)
    let number1=(a)=>{
        setnum1(a.target.value)
    }
    let number2=(b)=>{
        setnum2(b.target.value)
    }
    let sum=()=>{
        let a=Number(num1)
        let b=Number(num2)
        setResult("Sum="+(a+b));
        console.log("Sum="+(a+b));
    }
    let sub=()=>{
        let a=Number(num1)
        let b=Number(num2)
        console.log("Sub="+(a-b));
    }
    let mul=()=>{
        let a=Number(num1)
        let b=Number(num2)
        console.log("Mul="+(a*b));
    }
    let per=()=>{
        let a=Number(num1)
        let b=Number(num2)
        console.log("Per="+(a%b));
    }
    let div=()=>{
        let a=Number(num1)
        let b=Number(num2)
        console.log("Div="+(a/b));
    }
    return(
        <div>
            <label htmlFor="">Num-1</label>
            <input type="text" value={num1} onChange={number1}/>
            <label htmlFor="">Num-2</label>
            <input type="text" value={num2} onChange={number2}/>
            <button onClick={sum}>SUM   +</button>
            <button onClick={sub}>Sub  -</button>
            <button onClick={mul}>Mul  *</button>
            <button onClick={per}>Per  %</button>
            <button onClick={div}>Div  /</button>
            <h1>{result}</h1>
        </div>
    )
}
export default ControlledCal