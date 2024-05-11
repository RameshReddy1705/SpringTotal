const Theme=()=>{
    let light=()=>{
        document.body.style.background="gainsboro"
        document.body.style.color="black"
    }
    let dark=()=>{
        document.body.style.background="black"
        document.body.style.color="white"

    }

    return(
        <div>
            <input type="radio" onClick={light}/>
            <label htmlFor="">Light</label>
            <input type="radio" onClick={dark}/>
            <label htmlFor="">Dark</label>
            <h1>Light & Dark</h1>
        </div>
    )
}
export default Theme 