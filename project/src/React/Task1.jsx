const Task1=(x)=>{
    console.log(x.data)
    return(
        <div>
           <h1>{x.data[0].id}</h1> <h1>{x.data[0].name}</h1>
            <h1>{x.data[1].id}</h1> <h1>{x.data[1].name}</h1>
            <h1>{x.data[2].id}</h1> <h1>{x.data[2].name}</h1>
        </div>
    )
}
export default Task1