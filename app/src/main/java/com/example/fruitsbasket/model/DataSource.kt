package com.example.fruitsbasket.model

class DataSource {
    fun getCharInfo(): Array<Character> {

        val char1 = Character(
                "Tohru",
                "A lovely girl full of kindness.",
                "https://pbs.twimg.com/profile_images/1078025758365310976/QXzR_RLj_400x400.jpg")
        val char2 = Character(
                "Kyo",
                "A shy and fiery orange kitty.",
                "https://64.media.tumblr.com/fef6b6446740591e2edbd39318c26bef/e0fd1e85b3ec5030-ff/s640x960/f1b033a3d84d8a376f8e6f799aee6379cad4b14c.jpg")
        val char3 = Character(
                "Yuki",
                "A patient and perfect little mouse.",
                "https://64.media.tumblr.com/a472c79680a02d3c06b34dfbdb780a93/8a19189c7d299f97-75/s640x960/10bf43b8f5359ff29cc8a089478808acc152b7e5.jpg")
        val char4 = Character(
                "Hatsuharu",
                "A hot-and-cool tempered ox.",
                "https://64.media.tumblr.com/715db0edb93606905e7e3f059227a3b1/tumblr_psjfbgqe511ur9awh_1280.jpg")
        val char5 = Character(
                "Momiji",
                "An energetic and innocent rabbit.",
                "https://64.media.tumblr.com/ccc82ea03e16c38bbe44209dd5f4e73a/e71d2508184aebeb-a9/s640x960/bf26c5eee1f5fbac68835e93392f10c2ac066525.jpg")
        val char6 = Character(
                "Hatori",
                "A calm and gentle sea horse.",
                "https://pbs.twimg.com/profile_images/1338543621990125570/Dw6t9RAM_400x400.jpg")
        val char7 = Character(
                "Kisa",
                "A timid and shy tiger.",
                "https://i.pinimg.com/originals/a1/dc/21/a1dc21c2abbeaf7f4f6e8afbb61565c7.png")
        val char8 = Character(
                "Ayame",
                "A dramatic and enigmatic snake.",
                "https://i.pinimg.com/originals/93/ca/e4/93cae4f631cf7af33342e21067035316.jpg")
        val char9 = Character(
                "Rin",
                "A blunt and silently selfless horse.",
                "https://i.pinimg.com/originals/fa/9f/63/fa9f6394db375381fc562508f16fd28e.jpg")
        val char10 = Character(
                "Shigure",
                "A laid-back and conniving dog.",
                "https://i.pinimg.com/originals/42/7f/61/427f617923f17bcde36e6347baf821aa.jpg")
        val char11 = Character(
                "Kagura",
                "A loud and headstrong pig.",
                "https://i.pinimg.com/originals/7e/fa/1f/7efa1ff94328939083299176e9bf8464.jpg")
        val char12 = Character(
                "Kureno",
                "A sheltered and considerate rooster.",
                "https://i.pinimg.com/originals/ef/dd/86/efdd86f6e09c777b8b83103342b14d29.jpg")
        val char13 = Character(
                "Hiro",
                "A shy but sharp-tongued lamb.",
                "https://i.pinimg.com/originals/0f/1e/a0/0f1ea0a32773770173cedcc6737ef056.png")
        val char14 = Character(
                "Ritsu",
                "An over-anxious, cross-dressing monkey.",
                "https://i.pinimg.com/originals/82/7c/ca/827cca3f82e162f62f204e77edd7a722.png")
        val char15 = Character(
                "Akito",
                "A troubled, insecure being alike to a god for the zodiac spirits.",
                "https://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/akito-soma-fruits-basket-2019-3.77.jpg")

        val charList: Array<Character> = arrayOf(char1,char2,char3,char4,char5,char6,char7,char8,char9,char10,char11,char12,char13,char14,char15)
        return charList
    }
}