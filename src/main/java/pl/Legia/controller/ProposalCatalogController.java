package pl.Legia.controller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import pl.Legia.model.Proposal;
import pl.Legia.model.User;
import pl.Legia.pdfGenerator.PdfGenerator;
import pl.Legia.serviceLayer.ProposalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
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

        System.out.println(proposals.toString());
        request.getSession().setAttribute("proposals", proposals);

        Document document = new Document();
        try {
            response.setContentType("application/pdf");
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();

            PdfPTable table = new PdfPTable(3); // 3 columns.
            table.setWidthPercentage(100); //Width 100%
            table.setSpacingBefore(10f); //Space before table
            table.setSpacingAfter(10f); //Space after table

            document.add(new Paragraph("User name:"+loggedUser.getUsername()));
            document.add(new Paragraph(new Date().toString()));

            //Set Column widths
            float[] columnWidths = {1f, 1f, 1f};
            table.setWidths(columnWidths);

            PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
            cell1.setBorderColor(BaseColor.BLUE);
            cell1.setPaddingLeft(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
            cell2.setBorderColor(BaseColor.GREEN);
            cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
            cell3.setBorderColor(BaseColor.RED);
            cell3.setPaddingLeft(10);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);

            //To avoid having the cell border and the content overlap, if you are having thick cell borders
            //cell1.setUserBorderPadding(true);
            //cell2.setUserBorderPadding(true);
            //cell3.setUserBorderPadding(true);

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);

            document.add(table);
            //Add more content here
        } catch (Exception e) {
            e.printStackTrace();
        }
        document.close();
        request.getRequestDispatcher("WEB-INF/view/proposalCatalog.jsp").forward(request, response);
    }

        // show user's proposal
        /*
        System.out.println("ProposalCatalogController - get");

        User loggedUser = (User) request.getSession().getAttribute("user");
        System.out.println(loggedUser.toString());
        long user = loggedUser.getUser_id();
        ProposalService proposalService = new ProposalService();
        List<Proposal> proposals = proposalService.getProposalByUserId(user);

        System.out.println("Proposals dla Catalogu");
        System.out.println(proposals.toString());
        request.getSession().setAttribute("proposals", proposals);

        request.getRequestDispatcher("WEB-INF/view/proposalCatalog.jsp").forward(request, response);

        */
}

