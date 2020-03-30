package by.tms.recyclerview

import java.util.ArrayList

class BeerCollection {
    val beerCollection = ArrayList<Beer>()

    companion object {
        val instance by lazy {
            BeerCollection()
        }
    }

    fun fillGlassesWithBeer() {
        beerCollection.add(Beer("https://www.faustbrewing.com/images/beers/types/beerglasstwo.png", "Lidskoe Pivo", 1.9))
        beerCollection.add(Beer("https://static.vinepair.com/wp-content/uploads/2019/08/weasked10_header-2.jpg", "Zshigulyovskoe", 2.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
        beerCollection.add(Beer("https://dydza6t6xitx6.cloudfront.net/ci-stone-bourbon-barrel-aged-arrogant-bastard-e4700a9ac180072d.png", "Bastard", 5.5))
    }
}