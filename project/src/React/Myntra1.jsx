import img from "./mynt.png"
import style from "./myntra1.module.css"
import profile from"./profile.png"
import bag from "./bag.png"
import wishlist from "./wishlist.png"
const Myntra1=()=>{
    return(
       <section id={style.nav}>
            <article>
                <div className={style.Logo}>
                {/* <a href="https://www.myntra.com/"></a> */}
                <a href="https://www.myntra.com/"><img src={img}alt=""/></a>
                </div>
                <div className={style.Menu}>
                <ol>
                        <li><a href="https://www.myntra.com/shop/men">MEN</a></li>
                        <li><a href="https://www.myntra.com/shop/women">WOMEN</a></li>
                        <li><a href="https://www.myntra.com/shop/kids">KIDS</a></li>
                        <li><a href="https://www.myntra.com/shop/home-living">HOME & LIVING</a></li>
                        <li><a href="https://www.myntra.com/personal-care">BEAUTY</a></li>
                        <li><a href="https://www.myntra.com/studio/home?appRoute=%7B%22url%22%3A%22%2Fstudio%2Fhome%22%7D">STUDIO<sup>NEW</sup></a></li>
                    </ol>
                </div>
                <div className={style.Search}>
               
                    <div>
                            <a href="#"><i class="fa-solid fa-magnifying-glass"></i></a>
                            <input type="text" placeholder={"Search for products,brands and more"} />
                    </div>
                </div>
                <div className={style.Icons}>
                    <ol>
                        <li>
                        <a href=""><img src={profile} alt="" /></a></li>
                        <li> <a href="https://www.myntra.com/checkout/cart"><img src={bag} alt="" /></a></li>
                        <li><a href="https://www.myntra.com/wishlist"><img src={wishlist} alt="" /></a> </li>
                    </ol>
                    {/* <div>
                        <a href=""><img src={profile} alt="" /></a>
                    </div>
                    <div>
                        <a href="https://www.myntra.com/checkout/cart"><img src={bag} alt="" /></a>
                    </div>
                    <div>
                        <a href="https://www.myntra.com/wishlist"><img src={wishlist} alt="" /></a>
                    </div> */}
                </div>
            </article>
       </section>
    )
}
export default Myntra1