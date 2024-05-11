import React from 'react'
import tata from './tcs.module.css'
import pic from './Tcs.svg'
import logo from './logo-tata.svg'
const Tcs =()=>{
    return(
        <div>
            <section id={tata.select}>
                <article>
<div className={tata.photo}><img src={pic}alt="" /></div>
<div className={tata.font1}><ul>
<li>What we do</li>
<li>What we are</li>
<li>Insights</li>
<li>Careers</li>
<li>Investors</li></ul></div>
<div className={tata.dummy}></div>
<div className={tata.font2}><ul>
<li>CONTACTS US</li>
<li>TCS WORLDSWIDE</li></ul></div>

<div className={tata.search}><i class="fa-solid fa-magnifying-glass"></i>
</div>
<div className={tata.logo}><img src={logo} alt="" /></div>
                </article>
            </section>
        </div>
    )
}

export default Tcs;