const Count=(props)=>{
    return(
        <div>
           {props.children} : {props.data}
        </div>
    )
}
export default React.memo(Count)