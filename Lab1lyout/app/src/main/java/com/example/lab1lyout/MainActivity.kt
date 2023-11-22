package com.example.lab1lyout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1lyout.ui.theme.Lab1lyoutTheme

data class  Person(val name:String,
                   val studentID:String,
                   val imageID:Int)



class MainActivity : ComponentActivity() {
    var persons: List<Person> = listOf<Person>(
        Person("นางสาวสุธาดา โสภาพ","643450089-0",R.drawable.sutada),
        Person("นางสาวอมรรัตน์ มาระเหว","643450094-7",R.drawable.amonrat),
        Person("นางสาวนภัสสร ดวงจันทร์","643450326-2",R.drawable.napatson),
        Person("นางสาวอฆพร ไร่ขาม","643450334-3",R.drawable.akapon),
        Person("นายกมล จันบุตรดี","643450063-8",R.drawable.ake),
        Person("นางสาววรรณภา เบ้านาค","643450330-1",R.drawable.wanapa),
        Person("นางสาวนภาปิลันธ์ ชาวชายโขง","643450327-0",R.drawable.napapiran),
        Person("นายจักรพรรดิ์ อนุไพร","643450065-4",R.drawable.jakapat),
        Person("นายเจษฎา ลีรัตน์","643450067-0",R.drawable.jadsada1),
        Person("นางสาวศรสวรรค์ ไพรอนันต์","643450067-0",R.drawable.bo),
        Person("นางสาวณัฐธิดา บุญพา","643450647-2",R.drawable.jan),
        Person("นายอรัญ ศรีสวัสดิ์","643450095-5",R.drawable.arun),
        Person("นางสาวทัศนีย์ มลาตรี","643450075-1",R.drawable.tuk),
        Person("นางสาวนริศรา วงค์บุตรศรี","643450328-8",R.drawable.narisara),
        Person("นายชาญณรงค์ แต่งเมือง","643450069-6",R.drawable.chanalong),
        Person("นายณัฐกานต์ อินทรพานิชย์","643450072-7",R.drawable.natakan),
        Person("นายธนาธิป เตชะ","643450076-9",R.drawable.tanatip),
        Person("นางสาวกฤติยา สินโพธิ์","643450320-4",R.drawable.kitiya),
        Person("นางสาวพรธิตา ขานพล","643450080-8",R.drawable.pontita),
        Person("นายประสิทธิชัย จันทร์สม","643450079-3",R.drawable.pasitisia),
        Person("นายก้องภพ ตาดี","643450321-2",R.drawable.model),
        Person("นายเทวารัณย์ ชัยกิจ","643450324-6",R.drawable.run),
        Person("นายธนบดี สวัสดี","643450325-4",R.drawable.teammy),
        Person("นายวิญญู พรมภิภักดิ์","643450084-0",R.drawable.winyu),
        Person("นายเจษฏา พบสมัย","643450323-8",R.drawable.bank),
        Person("นายปรเมศวร์ สิทธิมงคล","643450078-5",R.drawable.make),
        Person("นายพีระเดช โพธิ์หล้า","643450082-4",R.drawable.peradate),
        Person("นายศรันย์ ซุ่นเส้ง","643450086-6",R.drawable.saran),
        Person("นายอภิทุน ดวงจันทร์คล้อย","643450092-1",R.drawable.apitun),
        Person("นายอภิวัฒน์ ดาวโคกสูง","643450093-9",R.drawable.impster),
        Person("นายปฏิภัทร ดำทองสุก","643450508-6",R.drawable.impster),
        Person("นายศุภชัย แสนประสิทธิ์","643450332-7",R.drawable.beaa),
        Person("นายเสฏฐวุฒิ สาระกุล","643450333-5",R.drawable.impster),
        Person("นายเกรียงศักดิ์ หมู่เมืองสอง","643450322-0",R.drawable.ll),
        Person("นายรัตพงษ์ ปานเจริญ","643450650-3",R.drawable.tey),
        Person("นายกฤตวัฒน์ อินทรสิทธิ์","643450644-8",R.drawable.impster),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1lyoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    LazyColumn(){
                        items(persons){
                            data -> PersonListItem(data)
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun PersonListItem(data:Person){
    Row(){

        Image(
            painter = painterResource(data.imageID),
            contentDescription = data.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )

        Column(modifier = Modifier.padding(4.dp),
            verticalArrangement = Arrangement.Center){

            Text(data.name)
            Text(data.studentID)
        }
    }


}




