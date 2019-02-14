<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update System Settings</title>
<!-- <style>
table, th, td {
  border: 1px solid black;
}
</style> -->
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>System Settings</h1>
<h2>General Setting</h2>
<form action="updateGeneralSetting" method="post">
<table  style="width:60%" >
<tr>
<th align="left">
ID</th><th align="left"><input type="text" name="generalSettingId" value="${generalSetting.generalSettingId}" readonly="readonly"/>
</th>
</tr>
<tr>
<th align="left">    
School Name</th><th align="left"><input type="text" name="schoolName" value="${generalSetting.schoolName}"/>
</th>
</tr>
<tr>
<th align="left">
Address</th><th align="left"><textarea name="schoolAddress" value="${generalSetting.schoolAddress}">${generalSetting.schoolAddress}</textarea>
</th>
</tr>
<tr>
<th align="left">
Phone</th><th align="left"><input type="text" name="schoolPhone" value="${generalSetting.schoolPhone}" />
</th>
</tr>
<tr>
<th align="left">
Email</th><th align="left"><input type="email" name="schoolEmail" value="${generalSetting.schoolEmail}" />
</th>
</tr>
<tr>
<th align="left">
School Code	</th><th align="left"><input type="text" name="schoolCode" value="${generalSetting.schoolCode}"/>
</th>
</tr>
<tr>
<th align="left">
Session</th><th align="left"><select name="session">
                                     <c:forEach items="${sessions}" var="sessions">
                                        <option value="${sessions.sessionTimePediod}">${sessions.sessionTimePediod}</option>
                                     </c:forEach>
                                   </select>
</th>
</tr>
<tr>
<th align="left">                        
Session Start Month</th><th align="left"><select name="sessionStartMonth">
                                       <option value="January">January</option>
                                       <option value="February">February</option>
                                       <option value="March">March</option>
                                       <option value="April">April</option>
                                       <option value="May">May</option>
                                       <option value="June">June</option>
                                       <option value="July">July</option>
                                       <option value="August">August</option>
                                       <option value="September">September</option>
                                       <option value="October">October</option>
                                       <option value="November">November</option>
                                       <option value="December">December</option>
                                    </select> 
</th>
</tr>
<tr>
<th align="left">            	
Language</th><th align="left"> <select name="language">
                                     <c:forEach items="${languages}" var="languages">
                                        <option value="${languages.languageName}">${languages.languageName}</option>
                                     </c:forEach>
                                   </select>
</th>
</tr>
<tr>
<th align="left">                         
Language RTL Text Mode</th><th align="left">  <input type="radio" name="languageRTLTextMode" value="Disabled"> Disabled <input type="radio" name="languageRTLTextMode" value="Enabled"> Enabled
</th>
</tr>
<tr>
<th align="left">        	
Timezone</th><th align="left">   <select name="timezone" >
	<option value="-12:00">(GMT -12:00) Eniwetok, Kwajalein</option>
	<option value="-11:00">(GMT -11:00) Midway Island, Samoa</option>
	<option value="-10:00">(GMT -10:00) Hawaii</option>
	<option value="-09:50">(GMT -9:30) Taiohae</option>
	<option value="-09:00">(GMT -9:00) Alaska</option>
	<option value="-08:00">(GMT -8:00) Pacific Time (US &amp; Canada)</option>
	<option value="-07:00">(GMT -7:00) Mountain Time (US &amp; Canada)</option>
	<option value="-06:00">(GMT -6:00) Central Time (US &amp; Canada), Mexico City</option>
	<option value="-05:00">(GMT -5:00) Eastern Time (US &amp; Canada), Bogota, Lima</option>
	<option value="-04:50">(GMT -4:30) Caracas</option>
	<option value="-04:00">(GMT -4:00) Atlantic Time (Canada), Caracas, La Paz</option>
	<option value="-03:50">(GMT -3:30) Newfoundland</option>
	<option value="-03:00">(GMT -3:00) Brazil, Buenos Aires, Georgetown</option>
	<option value="-02:00">(GMT -2:00) Mid-Atlantic</option>
	<option value="-01:00">(GMT -1:00) Azores, Cape Verde Islands</option>
	<option value="+00:00" selected="selected">(GMT) Western Europe Time, London, Lisbon, Casablanca</option>
	<option value="+01:00">(GMT +1:00) Brussels, Copenhagen, Madrid, Paris</option>
	<option value="+02:00">(GMT +2:00) Kaliningrad, South Africa</option>
	<option value="+03:00">(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg</option>
	<option value="+03:50">(GMT +3:30) Tehran</option>
	<option value="+04:00">(GMT +4:00) Abu Dhabi, Muscat, Baku, Tbilisi</option>
	<option value="+04:50">(GMT +4:30) Kabul</option>
	<option value="+05:00">(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent</option>
	<option value="+05:50">(GMT +5:30) Bombay, Calcutta, Madras, New Delhi</option>
	<option value="+05:75">(GMT +5:45) Kathmandu, Pokhara</option>
	<option value="+06:00">(GMT +6:00) Almaty, Dhaka, Colombo</option>
	<option value="+06:50">(GMT +6:30) Yangon, Mandalay</option>
	<option value="+07:00">(GMT +7:00) Bangkok, Hanoi, Jakarta</option>
	<option value="+08:00">(GMT +8:00) Beijing, Perth, Singapore, Hong Kong</option>
	<option value="+08:75">(GMT +8:45) Eucla</option>
	<option value="+09:00">(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk</option>
	<option value="+09:50">(GMT +9:30) Adelaide, Darwin</option>
	<option value="+10:00">(GMT +10:00) Eastern Australia, Guam, Vladivostok</option>
	<option value="+10:50">(GMT +10:30) Lord Howe Island</option>
	<option value="+11:00">(GMT +11:00) Magadan, Solomon Islands, New Caledonia</option>
	<option value="+11:50">(GMT +11:30) Norfolk Island</option>
	<option value="+12:00">(GMT +12:00) Auckland, Wellington, Fiji, Kamchatka</option>
	<option value="+12:75">(GMT +12:45) Chatham Islands</option>
	<option value="+13:00">(GMT +13:00) Apia, Nukualofa</option>
	<option value="+14:00">(GMT +14:00) Line Islands, Tokelau</option>
</select>											
</th>
</tr>
<tr>
<th align="left">				
Date Format	  </th><th align="left">    <select name="dateFormat">
                                       <option value="dd-mm-yyyy">dd-mm-yyyy</option>
                                       <option value="dd-mmm-yyyy">dd-mmm-yyyy</option>
                                       <option value="dd/mm/yyyy">dd/mm/yyyy</option>
                                       <option value="dd.mm.yyyy">dd.mm.yyyy</option>
                                       <option value="mm/dd/yyyy">mm/dd/yyyy</option>
                                       <option value="mm.dd.yyyy">mm.dd.yyyy</option>
                                       <option value="mm-dd-yyyy">mm-dd-yyyy</option>
                                    </select> 
</th>
</tr>
<tr>
<th align="left">
Currency	</th><th align="left">    <select name="currency">
	<option value="USD" selected="selected">United States Dollars</option>
	<option value="EUR">Euro</option>
	<option value="GBP">United Kingdom Pounds</option>
	<option value="DZD">Algeria Dinars</option>
	<option value="ARP">Argentina Pesos</option>
	<option value="AUD">Australia Dollars</option>
	<option value="ATS">Austria Schillings</option>
	<option value="BSD">Bahamas Dollars</option>
	<option value="BBD">Barbados Dollars</option>
	<option value="BEF">Belgium Francs</option>
	<option value="BMD">Bermuda Dollars</option>
	<option value="BRR">Brazil Real</option>
	<option value="BGL">Bulgaria Lev</option>
	<option value="CAD">Canada Dollars</option>
	<option value="CLP">Chile Pesos</option>
	<option value="CNY">China Yuan Renmimbi</option>
	<option value="CYP">Cyprus Pounds</option>
	<option value="CSK">Czech Republic Koruna</option>
	<option value="DKK">Denmark Kroner</option>
	<option value="NLG">Dutch Guilders</option>
	<option value="XCD">Eastern Caribbean Dollars</option>
	<option value="EGP">Egypt Pounds</option>
	<option value="FJD">Fiji Dollars</option>
	<option value="FIM">Finland Markka</option>
	<option value="FRF">France Francs</option>
	<option value="DEM">Germany Deutsche Marks</option>
	<option value="XAU">Gold Ounces</option>
	<option value="GRD">Greece Drachmas</option>
	<option value="HKD">Hong Kong Dollars</option>
	<option value="HUF">Hungary Forint</option>
	<option value="ISK">Iceland Krona</option>
	<option value="INR">India Rupees</option>
	<option value="IDR">Indonesia Rupiah</option>
	<option value="IEP">Ireland Punt</option>
	<option value="ILS">Israel New Shekels</option>
	<option value="ITL">Italy Lira</option>
	<option value="JMD">Jamaica Dollars</option>
	<option value="JPY">Japan Yen</option>
	<option value="JOD">Jordan Dinar</option>
	<option value="KRW">Korea (South) Won</option>
	<option value="LBP">Lebanon Pounds</option>
	<option value="LUF">Luxembourg Francs</option>
	<option value="MYR">Malaysia Ringgit</option>
	<option value="MXP">Mexico Pesos</option>
	<option value="NLG">Netherlands Guilders</option>
	<option value="NZD">New Zealand Dollars</option>
	<option value="NOK">Norway Kroner</option>
	<option value="PKR">Pakistan Rupees</option>
	<option value="XPD">Palladium Ounces</option>
	<option value="PHP">Philippines Pesos</option>
	<option value="XPT">Platinum Ounces</option>
	<option value="PLZ">Poland Zloty</option>
	<option value="PTE">Portugal Escudo</option>
	<option value="ROL">Romania Leu</option>
	<option value="RUR">Russia Rubles</option>
	<option value="SAR">Saudi Arabia Riyal</option>
	<option value="XAG">Silver Ounces</option>
	<option value="SGD">Singapore Dollars</option>
	<option value="SKK">Slovakia Koruna</option>
	<option value="ZAR">South Africa Rand</option>
	<option value="KRW">South Korea Won</option>
	<option value="ESP">Spain Pesetas</option>
	<option value="XDR">Special Drawing Right (IMF)</option>
	<option value="SDD">Sudan Dinar</option>
	<option value="SEK">Sweden Krona</option>
	<option value="CHF">Switzerland Francs</option>
	<option value="TWD">Taiwan Dollars</option>
	<option value="THB">Thailand Baht</option>
	<option value="TTD">Trinidad and Tobago Dollars</option>
	<option value="TRL">Turkey Lira</option>
	<option value="VEB">Venezuela Bolivar</option>
	<option value="ZMK">Zambia Kwacha</option>
	<option value="EUR">Euro</option>
	<option value="XCD">Eastern Caribbean Dollars</option>
	<option value="XDR">Special Drawing Right (IMF)</option>
	<option value="XAG">Silver Ounces</option>
	<option value="XAU">Gold Ounces</option>
	<option value="XPD">Palladium Ounces</option>
	<option value="XPT">Platinum Ounces</option>
</select>
</th>
</tr>
<tr>
<th align="left">
Currency Symbol    </th><th align="left">    <input type="text" name="currencySymbol" value="${generalSetting.currencySymbol}" />
</th>
</tr>
<tr>
<th align="right">
<input type="submit" value="save" />	
</th></tr></table>	<br>

</form>
${msg}
<br>


</div>
</body>
</html>