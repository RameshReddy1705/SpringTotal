import { useRef } from "react"

const UncontrolledRef=()=>{
    let name=useRef()
    console.log(name)
        let form=(e)=>{
            e.preventDefault()
            let a=name.current.value
            console.log(a)
        }
    return(
        
        <div>
            <form action="">
                <label htmlFor="">Name</label>
                <input type="text" ref={name}/>
                {/* <label htmlFor="">Number</label> */}
                {/* <input type="text"ref={num} /> */}
                <button onClick={form}>Submit</button>
            </form>
        </div>
    )
}
export default UncontrolledRef