const Buttons=(props1)=>{
    return(
        <div>
            <button onClick={props1.fun}>{props1.children}</button>
        </div>
    )
}
export default React