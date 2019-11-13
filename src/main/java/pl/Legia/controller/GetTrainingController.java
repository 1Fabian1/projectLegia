package pl.Legia.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import pl.Legia.model.Proposal;
import pl.Legia.model.Training;
import pl.Legia.model.User;
import pl.Legia.serviceLayer.ProposalService;
import pl.Legia.serviceLayer.TrainingService;
import sun.util.calendar.BaseCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class GetTrainingController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GetTrainingController - Get");

        User user;
        user = (User) request.getSession().getAttribute("user");
        Training testTraining = new Training();
        TrainingService trainingService = new TrainingService();
        System.out.println("USER ID = " + user.getUser_id());
        testTraining = trainingService.getTrainingByUserId(user.getUser_id());

        List<Proposal> proposals;
        int user_id = (int) user.getUser_id();
        ProposalService proposalService = new ProposalService();
        proposals = proposalService.getProposalByUserId(user_id);

        System.out.println(proposals.toString());
        request.getSession().setAttribute("proposals", proposals);
        request.getSession().setAttribute("trainig", testTraining);

        Document document = new Document();
        try {
            BaseFont helvetica = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED);
            Font helvetica12Bold = new Font(helvetica, 12, Font.BOLD);
            Font helvetica11 = new Font(helvetica, 11);
            Font helvetica9 = new Font(helvetica, 9);
            Font helvetica6 = new Font(helvetica, 6);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.now();
            System.out.println(dtf.format(localDate)); //2016/11/16

            response.setContentType("application/pdf");
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();

            //header
            Paragraph attachment = new Paragraph("Załącznik nr 2", helvetica11);
            attachment.setAlignment(Element.ALIGN_RIGHT);
            document.add(attachment);
//            Paragraph blank = new Paragraph("");
//            document.add(blank);

            Paragraph date = new Paragraph("Bydgoszcz " + dtf.format(localDate), helvetica11);
            date.setAlignment(Element.ALIGN_RIGHT);
            document.add(date);

            Paragraph dateUnder = new Paragraph("(miejscowość, data)        ", helvetica6);
            dateUnder.setAlignment(Element.ALIGN_RIGHT);
            document.add(dateUnder);

            Paragraph nameAndSurname = new Paragraph(proposals.get(0).getFirstName() + " " + proposals.get(0).getSurname(), helvetica11);
            nameAndSurname.setAlignment(Element.ALIGN_LEFT);
            document.add(nameAndSurname);

            Paragraph nameAndPlaceUnderDots = new Paragraph("       (Imię i nazwisko)", helvetica6);
            nameAndPlaceUnderDots.setAlignment(Element.ALIGN_LEFT);
            document.add(nameAndPlaceUnderDots);

            Paragraph pesel = new Paragraph(proposals.get(0).getPESEL());
            nameAndSurname.setAlignment(Element.ALIGN_LEFT);
            document.add(pesel);

            Paragraph peselUnderTable = new Paragraph("     (PESEL)", helvetica6);
            peselUnderTable.setAlignment(Element.ALIGN_LEFT);
            document.add(peselUnderTable);

            Paragraph nationality = new Paragraph(proposals.get(0).getCitizenship(), helvetica11);
            nationality.setAlignment(Element.ALIGN_LEFT);
            document.add(nationality);

            Paragraph nationalityUnderDots = new Paragraph("    (Obywatelstwo)", helvetica6);
            nationalityUnderDots.setAlignment(Element.ALIGN_LEFT);
            document.add(nationalityUnderDots);

            Paragraph nameAndAdresOfUni = new Paragraph(proposals.get(0).getUniversityName() + " " + testTraining.getUniversityAddress() + " " +
                    proposals.get(0).getFieldOfStudy() + " " + proposals.get(0).getYearOfStudy());
            nameAndAdresOfUni.setAlignment(Element.ALIGN_LEFT);
            document.add(nameAndAdresOfUni);

            Paragraph nameAndAdresOfUniUnderDots = new Paragraph("  (nazwa i adres uczelni, kierunek i rok studiów)", helvetica6);
            nationalityUnderDots.setAlignment(Element.ALIGN_LEFT);
            document.add(nameAndAdresOfUniUnderDots);

            Paragraph wkuIn = new Paragraph("WOJSKOWY KOMENDANT UZUPEŁNIEŃ", helvetica12Bold);
            wkuIn.setAlignment(Element.ALIGN_RIGHT);
            document.add(wkuIn);

            Paragraph wkuInPlaceName = new Paragraph("W Bydgoszczy", helvetica12Bold);
            wkuInPlaceName.setAlignment(Element.ALIGN_RIGHT);
            document.add(wkuInPlaceName);

            Paragraph wniosek = new Paragraph("WNIOSEK", helvetica12Bold);
            wniosek.setAlignment(Element.ALIGN_CENTER);
            document.add(wniosek);

            Paragraph oPowolanie = new Paragraph("O POWOŁANIE W TRYBIE OCHOTNICZYM DO ODBYCIA ĆWICZEŃ WOJSKOWYCH", helvetica11);
            oPowolanie.setAlignment(Element.ALIGN_CENTER);
            document.add(oPowolanie);

            Paragraph jaNizej = new Paragraph("Ja niżej podpisany (-a) " + proposals.get(0).getFirstName() + " " +
                    proposals.get(0).getSurname() + ", imię ojca: " + proposals.get(0).getFatherName(), helvetica11);
            jaNizej.setAlignment(Element.ALIGN_LEFT);
            document.add(jaNizej);

            Paragraph jaNizejDots = new Paragraph("  (Imię i nazwisko, imię ojca)", helvetica6);
            nationalityUnderDots.setAlignment(Element.ALIGN_CENTER);
            document.add(jaNizejDots);

            Paragraph zamieszkanie = new Paragraph("Zamieszkały (-a) " + proposals.get(0).getAddressOfStay() + " " +
                    proposals.get(0).getPhoneNumber(), helvetica11);
            zamieszkanie.setAlignment(Element.ALIGN_LEFT);
            document.add(zamieszkanie);

            Paragraph zamieszkanieDots = new Paragraph("(adres stałego zameldowania, kod pocztowy, nr telefonu)", helvetica6);
            nationalityUnderDots.setAlignment(Element.ALIGN_CENTER);
            document.add(zamieszkanieDots);

            Paragraph zamieszkanie2 = new Paragraph(proposals.get(0).getAddressOfCorrespondence() + " " +
                    proposals.get(0).getPhoneNumber(), helvetica11);
            zamieszkanie2.setAlignment(Element.ALIGN_LEFT);
            document.add(zamieszkanie2);

            Paragraph zamieszkanie2Dots = new Paragraph("(adres do korespondencji, kod pocztowy, nr telefonu, e-mail)", helvetica6);
            nationalityUnderDots.setAlignment(Element.ALIGN_CENTER);
            document.add(zamieszkanie2Dots);


        } catch (Exception e) {
            e.printStackTrace();
        }
        document.close();

        System.out.println(testTraining);

    }
}
