package com.example.fruitsbasket

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

        val charList: Array<Character> = arrayOf(char1,char2,char3,char4,char5)
        return charList
    }
}