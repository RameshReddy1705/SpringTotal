import image from "./myntra logo.png"
import profile from "./profile.png"
import wishlist from "./wishlist.png"
import bag from "./bag.png"
import css from "./navbarMyntra.module.css"
const NavBarMyntra=()=>{
    return(
        <section id={css.nav}>
            <article>
                <div className={css.logo}>
                    <a href="https://www.myntra.com/"><img src={image} height="64" width="113" alt=""/></a>
                </div>
                <div className={css.menu}>
                    <ol>
                        <li><a href="https://www.myntra.com/shop/men">MEN</a></li>
                        <li><a href="https://www.myntra.com/shop/women">WOMEN</a></li>
                        <li><a href="https://www.myntra.com/shop/kids">KIDS</a></li>
                        <li><a href="https://www.myntra.com/shop/home-living">HOME & LIVING</a></li>
                        <li><a href="https://www.myntra.com/personal-care">BEAUTY</a></li>
                        <li><a href="https://www.myntra.com/studio/home?appRoute=%7B%22url%22%3A%22%2Fstudio%2Fhome%22%7D">STUDIO<sup>NEW</sup></a></li>
                    </ol>
                </div>
                <div className={css.search}>
                    <ol>
                        <li>
                            <a href="#"><i class="fa-solid fa-magnifying-glass"></i></a>
                            <input type="text" name="" id="" defaultValue={"     Search for products,brands and more"} />
                        </li>
                    </ol>
                </div>
                <div className={css.set}>
                    <a href="#"><img src={profile} alt="" height="40" width=""/></a>
                    <a href="https://www.myntra.com/wishlist"><img src={wishlist} alt="" height="40" width=""/></a>
                    <a href="https://www.myntra.com/checkout/cart"><img src={bag} alt="" height="40" width=""/></a>
                </div>
            </article>
        </section>
    )
}
export default NavBarMyntra