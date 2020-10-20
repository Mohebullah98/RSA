import java.math.BigInteger;
import java.io.*;
class Main {
  public static BigInteger privateKey;
  public static BigInteger result;

  public static BigInteger encrypt(BigInteger number){
    BigInteger one = new BigInteger("1");
    BigInteger p = new BigInteger("1332061140839377881275519727319087664563488856868363921090395424176003152616860694181381143398958886259607293657001126184200768318416415606007833158939494315794328961487646727235838064540020547096394715096987075662967270767111833128464892735927736680676281574819109293384227032660487105717000617743694091166592360430209859676725860069486092083162245353787489347996458344474036872405942603186910010107030249504890805053796812313931063356431538211577486558808551432480653655410786671149204990680160299130601476673122202346746073152960215724110679148813387815550919294278374132793382003237507202781781016933560748035199284389762236567868983336572644092830076478031437341713748965371275907861617842781207938340308618406806132341761652317375596844412105643666482330760029638578300024864280034704974456560072577302079710967422894034833870079056341042313954950303306609775366758875654233649026454012791177182484068909800375740635567792618409877923903328804607686747508551182788215187315706825259409787659457");
    BigInteger q = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001598241813");
    BigInteger pMinus1 = p.subtract(one);
    BigInteger qMinus1 = q.subtract(one);
    BigInteger pMinus1qMinus1 = pMinus1.multiply(qMinus1);
    result = p.multiply(q);
    BigInteger e = new BigInteger("7247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247247");
    privateKey = e.modInverse(pMinus1qMinus1);
    
    BigInteger encrypted = number.modPow(e, result);
    return encrypted;
  }
  public static BigInteger decrypt(BigInteger EncryInfo){
    BigInteger info = EncryInfo.modPow(privateKey, result);
    return info;
  }
  public static BigInteger crack(BigInteger a){
    BigInteger x =new BigInteger("0");
    BigInteger index = new BigInteger("10000000000");
    while (x.equals(BigInteger.ZERO)){
      if(index.compareTo(a.divide(BigInteger.TWO))==1) break;
      index=index.nextProbablePrime();
      if(a.mod(index).equals(BigInteger.ZERO)) x=index;
    }
    return index;
  }
  public static void main(String[] args)throws Exception {
    BigInteger q = new BigInteger("345873843843");
    BigInteger f = encrypt(q);
    System.out.println(f);
    //System.out.println("\n"+result);
    System.out.println(decrypt(f));
   /* BigInteger a = new BigInteger("80");
    BigInteger b = new BigInteger("13");
    BigInteger bb = new BigInteger("37");
    BigInteger c = new BigInteger("77");
    System.out.println(a.modPow(b, c));
    BigInteger bbb = a.modPow(b,c);
    System.out.print(bbb.modPow(bb, c));*/
   /* BigInteger index = new BigInteger("8793227016206075594");
   
    System.out.println(crack(index));*/
    
    BigInteger R1 = new BigInteger("17");
    BigInteger R2 = new BigInteger("65");
    BigInteger R3 = new BigInteger("100");
    BigInteger R4 = new BigInteger("9");
    BigInteger R5 = new BigInteger("254");
    BigInteger R6 = new BigInteger("5578");
    BigInteger R7 = new BigInteger("2245677");
    BigInteger R8 = new BigInteger("65333");
    BigInteger R9 = new BigInteger("45");
    BigInteger R10 = new BigInteger("88");
    BigInteger R11 = new BigInteger("554");
    BigInteger R12 = new BigInteger("999");
    BigInteger R13 = new BigInteger("34");
    BigInteger R14 = new BigInteger("76567");
    BigInteger R15 = new BigInteger("56789");
    BigInteger R16 = new BigInteger("33342");
    BigInteger R17 = new BigInteger("2020");
    BigInteger R18 = new BigInteger("654");
    BigInteger R19 = new BigInteger("9876");
    BigInteger R20 = new BigInteger("45678");
    
    
    BigInteger IRN =  new BigInteger("213170789073032085963115202233494449568288940714834896888376160364723638475760030409751128820835134622803160119145256049794403730049747667616444900764355314313414061058855861593039637075701421608951927835808709684713360517849816046484101671941444559457068264071724962630989431216755855182257615438229967102977820651316062309297553633987770527593949776508137349616929790590685873966433740469888291692136328570730166821481705405756953680535245995673556430919106403458755697563871839207430242874714275620237209237788215492379958552245871890244978347556782825993563030789557903754414274484487003181594251370062833312174936898207604149070370891194540077548386056429193291306046557977848582303510293377441587423322816509284042122444945993091766696188001314416948170171318484364462120481514723244199636356658826316923113276143974507436528703444045253582734818563208159322805323120613079180157170241374459648760561081010948215366544106872407041401168013318723819488035344074020026072134094745734547715021643649764791487469230521914888648645478175625393320485915591127012442324266604844932155163312528881384637955795827185817756424777356784862617974482983110409723382023953465751270225934340041845539655721239172171332967323021968137770904563227959587286120372557173611744983590798413446265398801229065394771369680015459338076462136713852800728322094741450630325336020296499044731540353508984500054520171892851876472791567036400695818096828008223384468925896147070023907875484502822514311252464722380271648252505056330172581434682161148736692588777325701005531922352011538764886196239819950228599238566332253366900761488074851370023922852642569119076666576043353288647432637180764280466560753365488507631495152407794921971144917599500856419247110846566308583723829953648894076443049164038594168062078491166989644520692381606475319975269767149927638985068691252130305750630406154758444797556483113540586475894204731696153472621276370142507675647849223110677629520209712952721372751504377118018458811061778414");//get from Inquirer 
   


    BigInteger RN[] = new BigInteger[20];
    RN[0] = R1;
    RN[1] = R2;
    RN[2] = R3;
    RN[3] = R4;
    RN[4] = R5;
    RN[5] = R6;
    RN[6] = R7;
    RN[7] = R8;
    RN[8] = R9;
    RN[9] = R10;
    RN[10] = R11;
    RN[11] = R12;
    RN[12] = R13;
    RN[13] = R14;
    RN[14] = R15;
    RN[15] = R16;
    RN[16] = R17;
    RN[17] = R18;
    RN[18] = R19;
    RN[19] = R20;

    BigInteger i1 = new BigInteger("46349835938436123072409350535442483438559845985734928402498023593958384738574058240598249582358042592945728523048238752938592582459235723768767656543321233456789098765432456789035465768798786543567898765435678976543567897654323739849384039434834873487482302932938263367464563373940404837363525373849484635363839505947463749436383390220292836142634748493038272724634763489234632957645745874569425824592582745248572458247524957245925872459872459456287568523875823562387562385235723657652342394923968787877675656565645454545478867969708787765765654654634535435353645674765876978979878678767657657587979787678788888888888888888865675765757657657575756567575765645454466666666666666666666374653473658564758466573846387463487648346347468347684363487436746743436746748364384635443763453746347536757265347454376436523674564543676345436754376547645436754765467345347654367546754743543654437654765646456456347654776347634745347347634537465473457435344537347676764367674373464747373673474743754372537534743744764376434634658374837777777773487583587358735835738573587358753875353753853735873575387357558737855875873837535875837376534246238746328576586584564584564856458");
    BigInteger i2 = new BigInteger("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999991111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111187575765757657575676576575765765765756756555555555554444444444444444444444444473777777777777777777777777777777777777777777777772222222222222222222222222222222222222222222222222222222222227777777777777272727722772727272737445474747474746565656565656556656565656565656565656565656565656565656656565565665656565555555555555555555555555556666666666666666666666666666757575757777777777777755555555555555555555558885857574744444444444444444444444444444444444444444443333333333333333333333333333333333333336666666666666666");
    BigInteger i3 = new BigInteger("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666677777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777555555555555555555555555555555555555555544444444444444444444444444444477777777777777777777777777777777777777988888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888876576575675757676876876384763874632874638468568456784564584568456485658567586758734564786435765843657834565876345876345843658743568756735863458565576348564385643856348564358658634564856858435643");
    BigInteger i4 = new BigInteger("99999999999999999999999999999999999999999999999999998888888888888888888888888888888888877777777777777777777777777777777777777777777777777777777777777777777777777777777777777776666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666665555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555544444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444443333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333332222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222221111111111111111111111111111111111111111111111111111111111111111111111111111111999999999999999999999999999999999999999999999999999999999999999999999999587345984375943573495874598473595749857349587439573495875984579583475987354984759458754985749735987359854734834");
    BigInteger i5 = new BigInteger("12312131321321321312313123132132131323121132132132132132132132312312312312312312312312312312312312132312313131313113213231312312312313131311331213113133131313123123123123123123121231231231231231231231231213232312132312321312132312313131213213213231231231231231213213132132312132132312132132132132132132123132312131321323131213132222222222222222221133121313312312132132312312312312312312132312132132132131313213133131313113113132131321321321312313131313212331213213213313213213213131321231321321321321321323121321323123121321331231231221132132132312311331312312312313131231231213231213213231213133121323123123131311331313121233123121323123123123123123123123123213123213213213123123121331231231313122323113213212312313213231213213213231231231231231231231231213231231231213212323112312313213213231213132123123132123132132132133123122131111111111111111133123122311321321323123212133121323123123123123121323123123213123123123123213213213123123333333333333333333121323123123123213213213213121231323123123232323231111133313131313131331313131313131313131313133131313131313232323232322222222222313131313232322");
    BigInteger i6 = new BigInteger("7658785767777777777777777777777777777733333399999999999999999999999999999999999999993333333333333333333333333333333333300000000000000000000022222222222222222222244444444444444444488888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888886666666666666666666666876786765654656565576767688787667677777777777777777777777777766666666666666676767676766666666666666666665465454546456456456546546464646464654576576567");
    BigInteger i7 = new BigInteger("99999943333333333333333333300000000000000000000000000000000000000000000000000000000000400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000000000000000000000000003000000000000000400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000003");
    BigInteger i8 = new BigInteger("589574958793487945840587498527857629584795489576985645972485275682475628456728562573862587265827562857586725111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111213324344444222221111111111111111111112222223737377777777777777777777777777444444444444444444474444444444444444444444");
    BigInteger i9 = new BigInteger("54875845764857648568748574638785725874584576485764587345685765864587468570000000000000000000000000000000000000000000000000000000000000457454854545458375648576458568574684356857645874356834728221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636028221324252263636361282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636282213242522636363628221324252263636362822132425226363636");
    BigInteger i10 = new BigInteger("8933333333333333998888888888888888888888888884444444444444444444444444444444555555555555555555555555555555329848059452407548594598458478579855874579485746892475985895759875895930957420570593753953483073828574637485930387347284573595893483333333333333333333333333222222222222222222222222222299999999999999999999999999444444444444444444444444898439839843948394839483498349834983498493849483984394988493389484938948493948348394898493348938493984384983498493843938498493893389438498493894389438493849948338498934983489344389489343894839348938494839348948398394894894384391728172827827182178217812782178728187121728728127181728777777777777777777777777777777777777777777777777777777777777777777777777777777777777711111187777777777777777837288888888884728884788888888888888888888888888888888888888888888888288888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888847777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777288888888888888888888888888888888888888878222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222244444444444444444444444444444444444777777777777777777777777728472847284728472847");
    BigInteger i11 = new BigInteger("109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321");
    BigInteger i12 = new BigInteger("9846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537488889976665443984645373846574363526274846353748984645373846574363526274846353748984645373846574363526274846353748984645373846574363526274846353743536279846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537489846453738465743635262748463537482222");
    BigInteger i13 = new BigInteger("34791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174707777777777777777777888888888888888888888888888888888888888888888888222222222222222222222222222288347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470347911747034791174702233479117470347911747034791174703479117470347911747021347911747034791174703479117470347911747034791174703479117470347911747034791174703479117470");
    BigInteger i14 = new BigInteger("2718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467433327186146742718614674271861467427186146742271861467427186146742718614674127186146742718614674271861467427186146742718614674332718614674271861467427186146742718614674222271861467427186146742718614674777271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674271861467427186146742718614674");
    BigInteger i15 = new BigInteger("675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930211267584930216758493021675849302167584930216758493021675849302167584930213675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302166758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021367584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021675849302167584930216758493021");
    BigInteger i16 = new BigInteger("9444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475989444677777777777499996758855904986063904966040349680496830473465745875438574295874398473968735968734958475984634738392922");
    BigInteger i17 = new BigInteger("2020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020203320202020202020202020202020202020202020202020202022020202020202020202020202020202020202020202020202020202020202020123445202020202020202020202020202020202020202020202020567899009876542020202020202020");
    BigInteger i18 = new BigInteger("12343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232666666666666666666688888888888888888888558558855858585858585644646463535353335353535333557123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232112343212321234321232123432123212343212321123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232123432123212343212321234321232");
    BigInteger i19 = new BigInteger("979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345835555555555555555555555555555555555555555557777777777777777777777777777773333333333333333333333333797984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734581979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458979843584754836734589798435847548367345897984358475483673458");
    BigInteger i20 = new BigInteger("6758493027485937353546473837373738485869799685857464353523231220000000037363534343544665677476535343434225636447675849302748593735354647383737373848586979968585746435352323122000000003736353434354466567747653534343422563644767584930274859373535464738373737384858697996858574643535232312200000000373635343435446656774765353434342256364476758493027485937353546473837373738485869799685857464353523231220000000037363534343544665677476535343434225636447675849302748593735354647383737373848586979968585746435352323122000000003736353434354466567747653534343422563644767584930274859373535464738373737384858697996858574643535232312200000000373635343435446656774765353434342256364476758493027485937353546473837373738485869799685857464353523231220000000037363534343544665677476535343434225636447675849302748593735354647383737373848586979968585746435352323122000000003736353434354466567747653534343422563644767584930274859373535464738373737384858697996858574643535232312200000000373635343435446656774765353434342256364476758493027485937353546473837373738485869799685857464353523231220000000037363534343544665677476535343434225636447675849302748593735354647383737373848586979968585746435352323122000000003736353434354466567747653534343422563644767584930274859373535464738373737384858697996858574643535232312200000000373635343435446656774765353434342256364476758493027485937353546473837373738485869799685857464353523231220000000037363534343544665677476535343434225636447675849302748593735354647383737373848586979968585746435352323122000000003736353434354466567747653534343422563644716758493027485937353546473837373738485869799685857464353523231220000000037363534343544665677476535343434225636447");

    BigInteger IAry[] = new BigInteger[20];

    IAry[0] = i1;
    IAry[1] = i2;
    IAry[2] = i3;
    IAry[3] = i4;
    IAry[4] = i5;
    IAry[5] = i6;
    IAry[6] = i7;
    IAry[7] = i8;
    IAry[8] = i9;
    IAry[9] = i10;
    IAry[10] = i11;
    IAry[11] = i12;
    IAry[12] = i13;
    IAry[13] = i14;
    IAry[14] = i15;
    IAry[15] = i16;
    IAry[16] = i17;
    IAry[17] = i18;
    IAry[18] = i19;
    IAry[19] = i20;
    BigInteger encryptAry[] = new BigInteger[20];
    BigInteger decryptAry[] = new BigInteger[20];
    BigInteger outAry[] = new BigInteger[20];
    
  
    File outFile = new File("a.txt");
    FileWriter w = new FileWriter(outFile);
    for(int i=0;i<IAry.length;i++){
      encryptAry[i]=IRN.subtract(RN[i]);

    }
    File outFile2 = new File("RNs.txt");
    FileWriter w2 = new FileWriter(outFile2);
    for(int i=0;i<encryptAry.length;i++){
      decryptAry[i] = decrypt(encryptAry[i]);
      w2.write("\n\t------------- Output RN "+(i+1)+" ---------------\n" + decryptAry[i]+"\n");
    } 
    for(int i=0;i<encryptAry.length;i++){
      outAry[i]=decryptAry[i].add(IAry[i]);
      w.write("\n\t------------- Output n "+(i+1)+" ---------------\n" + outAry[i]+"\n");
    }
    w2.close();
    w.close();

  //492408114196309993915757761778636418588022568335271102737348230445755965083791332672588305492803178643344531651889994270482859122240625467773068659196158879783346380591022030985290783317743944938144628700369406197927961063340631152207235779950662816765745530029870277674439357467510368969916588971681580950094467340702718463993273840383630811283038283442196016884196358467646687537382791381826443097843220876808823973156857933358621332110234940682039506939531249123675572026225740390767538594623466641239682428715446010421382357362054567696236805211008563210136443285667534744935020635751970881351088572149619517331230240769105156641226867660729011083528909737863410076208052280500214245330583072902658290610444839440216267618689749850494711412792283018938685504739350400775703584828347171825551816396449980368021661133742581107970018346453243761947767751449601549688471150943460789747699774384948830949897844612533274886289390973693426309975527376074830254451581038124278908869533130032939078552239957948924414148092119360178749294474591991083909901165319088917202179060014950316974276599013989049634393779214191969340196012715904954068494964035133794220812800699136758322464012752568499000740843162456831912394702293159562289438884705113082364822347323257490824895726060100927896788055162123733966395116876197368459670241243502567984709314442829407386351473666033025219953601002489600786916572328282331879667315275731588663497106881827724854115173739418592618463356308302136141231893624471397406440009360564908569593602048336721267585821627515596752806920477731141000599703765079570810692585519397476086952586613429555217911431683705900816980888696597388817587527875407024330228963678512310664316424795605452316399618693870920720103867303981592123677676428728476494159562690363977336541450947014466709479543116210953043208179896539511807645576444728260736729129304188383369708431196109392666656276241100214702335770912250220755343111311814947520200512484581326004769933689619296003824211924984017

  }
}
