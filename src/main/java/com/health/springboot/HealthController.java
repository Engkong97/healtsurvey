package com.health.springboot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HealthController {

	@Scheduled(cron="1 * * * * *")
	public void index() throws FileNotFoundException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","util/chromedriver.exe");					
        System.out.println("Auto Gabut Web Health Form -CREATED By Om Js- ");
//        jatisForm();
		fifastrapayForm();
	}
	
	public void jatisForm() throws FileNotFoundException, InterruptedException{
		File myObj = new File("util/fieldjatis.txt");
        Scanner myReader = new Scanner(myObj);
        List<String> list = new ArrayList<String>();
        String field[]=null;
        int i=0;
        while (myReader.hasNextLine()) {
          list.add(myReader.nextLine()) ;
          System.out.println(list.get(i));
          i++;
        }
        myReader.close();
        for(int x=0 ;x<i ;x++) {
        	WebDriver driver = new ChromeDriver();
            String baseUrl = "https://bit.ly/JPSHealth";        
            driver.get(baseUrl);
            driver.manage().window().maximize();
            if(list.size()>0) {
                field = list.get(x).split("\\|");
            }
            if(field!=null) {
            	WebElement nama = driver.findElement(By.xpath("//input[@placeholder='Enter your answer']"));
            	nama.sendKeys(field[0]);

            	WebElement telp = driver.findElement(By.xpath("//input[@placeholder='The value must be a number']"));
            	telp.sendKeys(field[1]);            	
            }
            
            List<WebElement> companyRadio = driver.findElements(By.xpath("//input[@aria-label='JPS']"));
            WebElement company = companyRadio.get(0);
            company.click();
            
            List<WebElement> rmRadio = driver.findElements(By.xpath("//input[@aria-label='Dona Pratama Valco Qualentino']"));
            WebElement rm = rmRadio.get(0);
            rm.click();
            
            List<WebElement> assignmentRadio = driver.findElements(By.xpath("//input[@aria-label='Programmer']"));
            WebElement assignment = assignmentRadio.get(0);
            assignment.click();
            
            List<WebElement> workLocRadio = driver.findElements(By.xpath("//input[@aria-label='FIF']"));
            WebElement workLocation = workLocRadio.get(0);
            workLocation.click();
            
            List<WebElement> projectNameRadio = driver.findElements(By.xpath("//input[@aria-label='ASTRAPAY']"));
            WebElement projectName = projectNameRadio.get(0);
            projectName.click();
            
            List<WebElement> workCatRadio = driver.findElements(By.xpath("//input[@aria-label='Work from Home']"));
            WebElement workCat = workCatRadio.get(0);
            workCat.click();
            
                     
            WebElement nextFirst = driver.findElement(By.xpath("//button[@aria-label='Next']"));
            nextFirst.click();
            //10
            WebElement foreignCountryRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/label/input"));
            foreignCountryRadio.click();
            //11
            WebElement contactODPRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));         
            contactODPRadio.click();
            //12 
	        WebElement feverRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div[2]/div/label/input\r\n" + 
	        		""));
	        feverRadio.click();
	        //13
	        WebElement fluRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[5]/div/div[2]/div/div[2]/div/label/input\r\n" + 
	        		""));
	        fluRadio.click();
	        //14
            WebElement coughRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[6]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            coughRadio.click();
            //15
            WebElement breathingRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[7]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            breathingRadio.click();
            //16
            WebElement historyDiseaseRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[8]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            historyDiseaseRadio.click();
            //17
            WebElement currentIllRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[9]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            currentIllRadio.click();
            //18
            WebElement hospitalRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[10]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            hospitalRadio.click();
            //19
            WebElement familyRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[11]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            familyRadio.click();
            //20
            WebElement otherPersonRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[12]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            otherPersonRadio.click();
            //21
            WebElement anyFamilyMemberRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[13]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            anyFamilyMemberRadio.click();
            //22
            WebElement lastSevenDaysRadio = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[14]/div/div[2]/div/div[2]/div/label/input\r\n" + 
            		""));
            lastSevenDaysRadio.click();
            

            WebElement nextSecond = driver.findElement(By.xpath("//button[@aria-label='Next']"));
            nextSecond.click();
            TimeUnit.SECONDS.sleep(10);
//
//            WebElement submit = driver.findElement(By.xpath("//button[@aria-label='Submit']"));
//            submit.click();
            System.out.println("PENGISIAN FORM JATIS atas nama "+field[0]+" SUKSES, PADA JAM "+ new Date());
            TimeUnit.SECONDS.sleep(10);
            driver.close();
        }
	}
	
	public void fifastrapayForm() throws FileNotFoundException, InterruptedException {        
        File myObj = new File("field.txt");
        Scanner myReader = new Scanner(myObj);
        List<String> list = new ArrayList<String>();
        String field[]=null;
        int i=0;
        while (myReader.hasNextLine()) {
          list.add(myReader.nextLine()) ;
          System.out.println(list.get(i));
          i++;
        }
        myReader.close();
        for(int x=0 ;x<i ;x++) {
        	WebDriver driver = new ChromeDriver();

            String baseUrl = "http://fifgroup-form.fifgroup.co.id:5000/fifgrouphealthsurvey";        
            driver.get(baseUrl);
            driver.manage().window().maximize();

            List<WebElement> kehadiranRadio = driver.findElements(By.id("kehadiran"));
            WebElement kehadiran = kehadiranRadio.get(3);
            kehadiran.click();
           				
            List<WebElement> lokasiKerjaRadio = driver.findElements(By.id("statkar"));
            WebElement lokasi = lokasiKerjaRadio.get(1);
            lokasi.click();
            
            if(list.size()>0) {
                field = list.get(x).split("\\|");
                System.out.println("data yg diproses = "+list.get(x));
            }
            if(field!=null) {
            	WebElement npk = driver.findElement(By.id("npk"));
                npk.sendKeys(field[0]);
//                npk.sendKeys("OUT1106");
                
                WebElement nama = driver.findElement(By.id("nama"));
                nama.sendKeys(field[1]);
//                nama.sendKeys("Arya Nur Prasetya");
            }
            
            
            List<WebElement> koncovRadio = driver.findElements(By.id("koncov"));
            WebElement koncov = koncovRadio.get(2);
            koncov.click();
            
            List<WebElement> suhuselfRadio = driver.findElements(By.id("suhuself"));
            WebElement suhuself = suhuselfRadio.get(0);
            suhuself.click();
            
            List<WebElement> kondisiRadio = driver.findElements(By.id("kondisi"));
            WebElement kondisi = kondisiRadio.get(0);
            kondisi.click();
            
            List<WebElement> zonaRadio = driver.findElements(By.id("zona"));
            WebElement zona = zonaRadio.get(1);
            zona.click();
            
            List<WebElement> koncovfamRadio = driver.findElements(By.id("koncovfam"));
            WebElement koncovfam = koncovfamRadio.get(2);
            koncovfam.click();
            
            List<WebElement> kondisifamRadio = driver.findElements(By.id("kondisifam"));
            WebElement kondisifam = kondisifamRadio.get(0);
            kondisifam.click();
            
            List<WebElement> zonafamRadio = driver.findElements(By.id("zonafam"));
            WebElement zonafam = zonafamRadio.get(1);
            zonafam.click();
            
           List<WebElement> acceptRadio = driver.findElements(By.id("accept"));
            WebElement accept = acceptRadio.get(0);
            accept.click();
            
            TimeUnit.SECONDS.sleep(10);
            
            WebElement submit = driver.findElement(By.cssSelector(".btn-primary"));
            //submit.click();
            
            System.out.println("PENGISIAN FORM ASTRAPAY atas nama "+field[1]+" SUKSES, PADA JAM "+ new Date());
            driver.close();
        }
        
	
		
	}

}
