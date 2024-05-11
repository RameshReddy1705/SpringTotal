const PropChildren=(abc)=>{
    console.log(abc);
    return(
        <div>
            {abc.data}{abc.children}
        </div>
    )
}
export default PropChildren