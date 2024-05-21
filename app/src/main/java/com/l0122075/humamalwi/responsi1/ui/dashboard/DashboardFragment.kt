package com.l0122075.humamalwi.responsi1.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.l0122075.humamalwi.responsi1.AdapterClass
import com.l0122075.humamalwi.responsi1.DataClass
import com.l0122075.humamalwi.responsi1.DetailDataClass
import com.l0122075.humamalwi.responsi1.R

class DashboardFragment : Fragment() {

    private lateinit var adapter: AdapterClass
    private lateinit var recyclerView: RecyclerView
    private lateinit var array: ArrayList<DataClass>

    private lateinit var Image: Array<Int>
    private lateinit var Title: Array<String>
    private lateinit var Des: Array<String>
    private lateinit var Detail: Array<ArrayList<DetailDataClass>>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.dashboard)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterClass(array)
        recyclerView.adapter = adapter

        adapter.onItemClick = { data ->
            val intent = Intent(context, DetailActivity::class.java).apply {
                putParcelableArrayListExtra("DETAILS", data.Detail)
                putExtra("IMAGE", data.Image)
                putExtra("TITLE", data.Title)
                putExtra("DESCRIPTION", data.Des)
            }
            startActivity(intent)
        }
    }

    private fun dataInitialize() {
        array = ArrayList()

        val KruImagesList = arrayListOf(
            arrayListOf(
                R.drawable.edwardnewgate,
                R.drawable.marco,
                R.drawable.portgasdace,
                R.drawable.jozu,
                R.drawable.izou,
                R.drawable.kozukioden,
                R.drawable.thatch,
                R.drawable.vista,
                R.drawable.blamenco,
                R.drawable.rakuyo,
                R.drawable.namur,
                R.drawable.blenheim,
                R.drawable.curiel,
                R.drawable.atmos,
                R.drawable.kingdew,
                R.drawable.fossa,
            ),
            arrayListOf(
                R.drawable.goldroger,
                R.drawable.silversrayleigh,
                R.drawable.scoppergaban,
                R.drawable.shanks,
                R.drawable.buggy,
                R.drawable.crocus,
                R.drawable.seagullgunsnozdon,
                R.drawable.sunbell
            ),
            arrayListOf(
                R.drawable.shanks2,
                R.drawable.bennbeckman,
                R.drawable.luckyroux,
                R.drawable.yasopp,
                R.drawable.limejuice,
                R.drawable.bonkpunch,
                R.drawable.monster,
                R.drawable.buildingsnake,
                R.drawable.hongo,
                R.drawable.gab
            ),
            arrayListOf(
                R.drawable.charlottelinlin,
                R.drawable.charlottekatakuri,
                R.drawable.charlottecracker,
                R.drawable.charlottesmoothie,
                R.drawable.charlotteperospero,
                R.drawable.charlottecompote,
                R.drawable.charlottedaifuku,
                R.drawable.charlotteoven,
                R.drawable.charlotteamande,
                R.drawable.charlottebrulee
            ),
            arrayListOf(
                R.drawable.kaido,
                R.drawable.king,
                R.drawable.queen,
                R.drawable.jack,
                R.drawable.pageone,
                R.drawable.xdrake,
                R.drawable.ulti,
                R.drawable.sasaki,
                R.drawable.whoswho,
                R.drawable.blackmaria
            ),
            arrayListOf(
                R.drawable.marshalldteach,
                R.drawable.jesusburgess,
                R.drawable.shiliew,
                R.drawable.vanaugur,
                R.drawable.kuzan,
                R.drawable.avalopizarro,
                R.drawable.laffitte,
                R.drawable.catarindevon,
                R.drawable.docq
            ),
            arrayListOf(
                R.drawable.monkeydluffy,
                R.drawable.roronoazoro,
                R.drawable.sanji,
                R.drawable.jinbe,
                R.drawable.nicorobin,
                R.drawable.nami,
                R.drawable.usopp,
                R.drawable.chopper,
                R.drawable.franky,
                R.drawable.brook,
                R.drawable.nefertarivivi

            ),
            arrayListOf(
                R.drawable.trafalgardwaterlaw,
                R.drawable.bepo,
                R.drawable.shachi,
                R.drawable.ikkaku,
                R.drawable.jeanbart
            ),
            arrayListOf(
                R.drawable.eustasskid,
                R.drawable.killer,
                R.drawable.heat,
                R.drawable.wire
            ),
            arrayListOf(
                R.drawable.donquixotedoflamingo,
                R.drawable.trebol,
                R.drawable.diamante,
                R.drawable.pica,
                R.drawable.vergo,
                R.drawable.sugar,
                R.drawable.laog,
                R.drawable.senorpink,
                R.drawable.dellinger,
                R.drawable.gladius,
                R.drawable.baby5,
                R.drawable.monet
            )
        )

        val KruNamesList = arrayListOf(
            arrayListOf(
                "Edward Newgate", "Marco", "Portgas D. Ace", "Jozu", "Izou", "Kozuki Oden", "Thatch", "Vista", "Blamenco", "Rakuyo", "Namur", "Blenheim", "Curiel", "Atmos", "Kingdew", "Fossa"
            ),
            arrayListOf(
                "Gol D. Roger", "Silvers Rayleigh", "Scopper Gaban", "Shanks", "Buggy", "Crocus", "Seagull Guns Nuzdon", "Sunbell"
            ),
            arrayListOf(
                "Shanks", "Benn Beckman", "Lucky Roux", "Yasopp", "Limejuice", "Bonk Punch", "Monster", "Building Snake", "Hongo", "Gap"
            ),
            arrayListOf(
                "Charlotte Linlin", "Charlotte Katakuri", "Charlotte Cracker", "Charlotte Smoothie", "Charlotte Perospero", "Charlotte Compote", "Charlotte Daifuku", "Charlotte Oven", "Charlotte Amande", "Charlotte Brulee"
            ),
            arrayListOf(
                "Kaido", "King", "Queen", "Jack", "Page One", "X Drake", "Ulti", "Sasaki", "Who's Who", "Black Maria"
            ),
            arrayListOf(
                "Marshall D. Teach", "Jesus Burgess", "Shiliew", "Van Augur", "Kuzan", "Avalo Pizarro", "Laffite", "Catarina Devon", "Doc Q"
            ),
            arrayListOf(
                "Monkey D. Luffy", "Roronoa Zoro", "Sanji", "Jinbe", "Nico Robin", "Nami", "Usopp", "Chopper", "Franky", "Brook", "Nefertari Vivi"
            ),
            arrayListOf(
                "Trafalgar D. Water Law", "Bepo", "Shachi", "Ikkaku", "Jean Bart"
            ),
            arrayListOf(
                "Eustass Kid", "Killer", "Heat", "Wire"
            ),
            arrayListOf(
                "Donquixote Doflamingo", "Trebol", "Diamante", "Pica", "Vergo", "Sugar", "Lao G", "Senor Pink", "Dellinger", "Gladius", "Baby 5", "Monet"
            )

        )

        val indexList = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

        Image = arrayOf(
            R.drawable.krushirohige,
            R.drawable.kruroger,
            R.drawable.krushanks,
            R.drawable.krubigmom,
            R.drawable.krukaido,
            R.drawable.krukurohige,
            R.drawable.krutopijerami,
            R.drawable.krulaw,
            R.drawable.krukid,
            R.drawable.krudofi
        )

        Title = resources.getStringArray(R.array.kru_titles)
        Des = resources.getStringArray(R.array.kru_descriptions)

        Detail = Array(indexList.size) { index ->
            val kruImages = KruImagesList[indexList[index]]
            val kruNames = KruNamesList[indexList[index]]
            val detailDataList = kruImages.mapIndexed { j, imageRes ->
                DetailDataClass(imageRes, kruNames[j])
            } as ArrayList<DetailDataClass>
            detailDataList
        }

        for (i in Image.indices) {
            val item = DataClass(
                Image[i],
                Title[i],
                Des[i],
                Detail[indexList[i]]
            )
            array.add(item)
        }
    }
}
