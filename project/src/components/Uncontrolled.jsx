import { useRef } from "react"

const Uncontrolled=()=>{
    let name =useRef()
    let email=useRef()
    console.log(name)
    console.log(email)

    let getData=(e)=>{
        console.log(e)
        e.preventDefault()
        let username = name.current.value
        let useremail= name.current.value

        console.log(username);
        console.log(useremail);
    }
    return(

        <div>
            <form action="">
                <label htmlFor="">Name</label>
                <input type="text" ref={name} />
                <br /><br />
                <label htmlFor="">Email</label>
                <input type="email" ref={email} />
                <button onClick={getData}>Submit</button>
            </form>
        </div>
    )
}
export default Uncontrolled