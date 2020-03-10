package pl.Legia.controller;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import pl.Legia.model.Proposal;
import pl.Legia.model.User;
import pl.Legia.serviceLayer.ProposalService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProposalCatalogController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ProposalCatalogController - get");
        long user;
        List<Proposal> proposals;

        User loggedUser = (User) request.getSession().getAttribute("user");
        user = loggedUser.getUser_id();
        ProposalService proposalService = new ProposalService();
        proposals = proposalService.getProposalByUserId(user);

        request.getSession().setAttribute("proposals", proposals);

        Document document = new Document();
        try {
            BaseFont helvetica = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED);
            Font helvetica12Bold = new Font(helvetica, 12, Font.BOLD);
            Font helvetica11 = new Font(helvetica, 11);
            Font helvetica9 = new Font(helvetica, 9);
            response.setContentType("application/pdf");
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();

            Paragraph beginning = new Paragraph("WNIOSEK\n " +
                    "O POWOŁANIE DO ODBYCIA PRZESZKOLENIA WOJSKOWEGO - CZĘŚĆ \n" +
                    "TEORETYCZNA - EDUKACJI WOJSKOWEJ STUDENTÓW W RAMACH \n" +
                    "LEGII AKADEMICKIEJ", helvetica12Bold);
            beginning.setAlignment(Element.ALIGN_CENTER);
            Paragraph beginning2 = new Paragraph("Ja, niżej podpisany/a zwracam się z wnioskiem o powołanie mnie w trybie ochotniczym do \n" +
                    "odbycia przeszkolenia wojskowego - część teoretyczna - edukacji wojskowej studentów w ramach \n" +
                    "legii akademickiej \n" +
                    " \n", helvetica11);
            beginning2.setAlignment(Element.ALIGN_CENTER);


            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);

            table.setSpacingBefore(5f);
            table.setSpacingAfter(5f);


            PdfPCell cellFirstNameA = new PdfPCell(new Paragraph("Imię i nazwisko: ", helvetica11));
            cellFirstNameA.setPaddingLeft(10);
            cellFirstNameA.setFixedHeight(30f);
            cellFirstNameA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellFirstNameB = new PdfPCell(new Paragraph(proposals.get(0).getFirstName() + " " + proposals.get(0).getSurname(), helvetica11));
            cellFirstNameB.setPaddingLeft(10);
            cellFirstNameB.setFixedHeight(30f);
            cellFirstNameB.setVerticalAlignment(Element.ALIGN_MIDDLE);


            PdfPCell cellFatherNameA = new PdfPCell(new Paragraph("Imię ojca: ", helvetica11));
            cellFatherNameA.setPaddingLeft(10);
            cellFatherNameA.setFixedHeight(30f);
            cellFatherNameA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellFatherNameB = new PdfPCell(new Paragraph(proposals.get(0).getFatherName(), helvetica11));
            cellFatherNameB.setPaddingLeft(10);
            cellFatherNameB.setFixedHeight(30f);
            cellFatherNameB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellCitizenShipA = new PdfPCell(new Paragraph("Obywatelstwo: ", helvetica11));
            cellCitizenShipA.setPaddingLeft(10);
            cellCitizenShipA.setFixedHeight(30f);
            cellCitizenShipA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellCitizenShipB = new PdfPCell(new Paragraph(proposals.get(0).getCitizenship(), helvetica11));
            cellCitizenShipB.setPaddingLeft(10);
            cellCitizenShipB.setFixedHeight(30f);
            cellCitizenShipB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellBirthDateA = new PdfPCell(new Paragraph("Data i miejsce urodzenia: ", helvetica11));
            cellBirthDateA.setPaddingLeft(10);
            cellBirthDateA.setFixedHeight(30f);
            cellBirthDateA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellBirthDateB = new PdfPCell(new Paragraph(String.valueOf(proposals.get(0).getBirthDate() + "" + proposals.get(0).getBirthPlace()), helvetica11));
            cellBirthDateB.setPaddingLeft(10);
            cellBirthDateB.setFixedHeight(30f);
            cellBirthDateB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellPESELA = new PdfPCell(new Paragraph("PESEL: ", helvetica11));
            cellPESELA.setPaddingLeft(10);
            cellPESELA.setFixedHeight(30f);
            cellPESELA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellPESELB = new PdfPCell(new Paragraph(proposals.get(0).getPESEL(), helvetica11));
            cellPESELB.setPaddingLeft(10);
            cellPESELB.setFixedHeight(30f);
            cellPESELB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellAdressStayA = new PdfPCell(new Paragraph("Adres pobytu stałego: ", helvetica11));
            cellAdressStayA.setPaddingLeft(10);
            cellAdressStayA.setFixedHeight(30f);
            cellAdressStayA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellAdressStayB = new PdfPCell(new Paragraph(proposals.get(0).getAddressOfStay(), helvetica11));
            cellAdressStayB.setPaddingLeft(10);
            cellAdressStayB.setFixedHeight(30f);
            cellAdressStayB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellAdressCorespondenceA = new PdfPCell(new Paragraph("Adres do korespondencji: ", helvetica11));
            cellAdressCorespondenceA.setPaddingLeft(10);
            cellAdressCorespondenceA.setFixedHeight(30f);
            cellAdressCorespondenceA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellAdressCorespondenceB = new PdfPCell(new Paragraph(proposals.get(0).getAddressOfCorrespondence(), helvetica11));
            cellAdressCorespondenceB.setPaddingLeft(10);
            cellAdressCorespondenceB.setFixedHeight(30f);
            cellAdressCorespondenceB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellPhoneNumberA = new PdfPCell(new Paragraph("Telefon kontaktowy: ", helvetica11));
            cellPhoneNumberA.setPaddingLeft(10);
            cellPhoneNumberA.setFixedHeight(30f);
            cellPhoneNumberA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellPhoneNumberB = new PdfPCell(new Paragraph(proposals.get(0).getPhoneNumber(), helvetica11));
            cellPhoneNumberB.setPaddingLeft(10);
            cellPhoneNumberB.setFixedHeight(30f);
            cellPhoneNumberB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellUniveristyNameA = new PdfPCell(new Paragraph("Nazwa uczelni: ", helvetica11));
            cellUniveristyNameA.setPaddingLeft(10);
            cellUniveristyNameA.setFixedHeight(30f);
            cellUniveristyNameA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellUniveristyNameB = new PdfPCell(new Paragraph(proposals.get(0).getUniversityName(), helvetica11));
            cellUniveristyNameB.setPaddingLeft(10);
            cellUniveristyNameB.setFixedHeight(30f);
            cellUniveristyNameB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellFieldOfStudyA = new PdfPCell(new Paragraph("Kierunek studiów: ", helvetica11));
            cellFieldOfStudyA.setPaddingLeft(10);
            cellFieldOfStudyA.setFixedHeight(30f);
            cellFieldOfStudyA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellFieldOfStudyB = new PdfPCell(new Paragraph(proposals.get(0).getFieldOfStudy(), helvetica11));
            cellFieldOfStudyB.setPaddingLeft(10);
            cellFieldOfStudyB.setFixedHeight(30f);
            cellFieldOfStudyB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellYearOfStudyA = new PdfPCell(new Paragraph("Aktualny rok studiów: ", helvetica11));
            cellYearOfStudyA.setPaddingLeft(10);
            cellYearOfStudyA.setFixedHeight(30f);
            cellYearOfStudyA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellYearOfStudyB = new PdfPCell(new Paragraph(proposals.get(0).getYearOfStudy(), helvetica11));
            cellYearOfStudyB.setPaddingLeft(10);
            cellYearOfStudyB.setFixedHeight(30f);
            cellYearOfStudyB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellPlannedYearOfGraduationA = new PdfPCell(new Paragraph("Planowany rok ukończenia: ", helvetica11));
            cellPlannedYearOfGraduationA.setPaddingLeft(10);
            cellPlannedYearOfGraduationA.setFixedHeight(30f);
            cellPlannedYearOfGraduationA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellPlannedYearOfGraduationB = new PdfPCell(new Paragraph(proposals.get(0).getPlannedYearOfGraduation(), helvetica11));
            cellPlannedYearOfGraduationB.setPaddingLeft(10);
            cellPlannedYearOfGraduationB.setFixedHeight(30f);
            cellPlannedYearOfGraduationB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellHealthCategoryA = new PdfPCell(new Paragraph("Orzeczona kategoria zdolności \n " +
                    "do czynnej służby wojskowej: ", helvetica11));
            cellHealthCategoryA.setPaddingLeft(10);
            cellHealthCategoryA.setFixedHeight(30f);
            cellHealthCategoryA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellHealthCategoryB = new PdfPCell(new Paragraph(proposals.get(0).getHealthCategory(), helvetica11));
            cellHealthCategoryB.setPaddingLeft(10);
            cellHealthCategoryB.setFixedHeight(30f);
            cellHealthCategoryB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellCrimeRecordA = new PdfPCell(new Paragraph("Byłem karany za przestępstwo umyślne: ", helvetica11));
            cellCrimeRecordA.setPaddingLeft(10);
            cellCrimeRecordA.setFixedHeight(30f);
            cellCrimeRecordA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellCrimeRecordB = new PdfPCell(new Paragraph(proposals.get(0).getCrime_record(), helvetica11));
            cellCrimeRecordB.setPaddingLeft(10);
            cellCrimeRecordB.setFixedHeight(30f);
            cellCrimeRecordB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellAlbumNumberA = new PdfPCell(new Paragraph("Numer albumu: ", helvetica11));
            cellAlbumNumberA.setPaddingLeft(10);
            cellAlbumNumberA.setFixedHeight(30f);
            cellAlbumNumberA.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cellAlbumNumberB = new PdfPCell(new Paragraph(proposals.get(0).getAlbum_number(), helvetica11));
            cellAlbumNumberB.setPaddingLeft(10);
            cellAlbumNumberB.setFixedHeight(30f);
            cellAlbumNumberB.setVerticalAlignment(Element.ALIGN_MIDDLE);

            Paragraph end = new Paragraph("Oświadczam, że jestem świadomy/a odpowiedzialności karnej za podawanie nieprawdziwych danych. " +
                    "Wyrażam zgodę na przetwarzanie moich danych osobowych dla potrzeb realizacji procesu rekrutacji Legii Akademickiej" +
                    " (zgodnie z art. 28 ogólnego rozporządzenia UE 2016/679 z 27 kwietnia 2016 r. w sprawie ochrony osób fizycznych w związku \n" +
                    "z przetwarzaniem danych osobowych i w sprawie swobodnego przepływu takich danych – Dz.Urz.UE.L Nr 119, str.1.)", helvetica9);
            end.setAlignment(Element.ALIGN_CENTER);

            Paragraph signup = new Paragraph("..................... \t \t \t                                                                    ............................. ", helvetica9);
            signup.setSpacingBefore(5f); //Space before table
            signup.setSpacingAfter(5f); //Space after table



            Paragraph signup2 = new Paragraph("(miejscowość i data) \t \t \t                                                                         (podpis wnioskodawcy) ", helvetica9);
            signup2.setSpacingBefore(5f); //Space before table
            signup2.setSpacingAfter(5f); //Space after table
            //To avoid having the cell border and the content overlap, if you are having thick cell borders
            //cell1.setUserBorderPadding(true);
            //cell2.setUserBorderPadding(true);
            //cell3.setUserBorderPadding(true);


            table.addCell(cellFirstNameA);
            table.addCell(cellFirstNameB);
            table.addCell(cellFatherNameA);
            table.addCell(cellFatherNameB);
            table.addCell(cellCitizenShipA);
            table.addCell(cellCitizenShipB);
            table.addCell(cellBirthDateA);
            table.addCell(cellBirthDateB);
            table.addCell(cellPESELA);
            table.addCell(cellPESELB);
            table.addCell(cellAdressStayA);
            table.addCell(cellAdressStayB);
            table.addCell(cellAdressCorespondenceA);
            table.addCell(cellAdressCorespondenceB);
            table.addCell(cellPhoneNumberA);
            table.addCell(cellPhoneNumberB);
            table.addCell(cellUniveristyNameA);
            table.addCell(cellUniveristyNameB);
            table.addCell(cellFieldOfStudyA);
            table.addCell(cellFieldOfStudyB);
            table.addCell(cellPlannedYearOfGraduationA);
            table.addCell(cellPlannedYearOfGraduationB);
            table.addCell(cellHealthCategoryA);
            table.addCell(cellHealthCategoryB);
            table.addCell(cellCrimeRecordA);
            table.addCell(cellCrimeRecordB);
            table.addCell(cellAlbumNumberA);
            table.addCell(cellAlbumNumberB);

            document.add(beginning);
            document.add(beginning2);
            document.add(table);
            document.add(end);
            document.add(signup);
            document.add(signup2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        document.close();
    }

}

