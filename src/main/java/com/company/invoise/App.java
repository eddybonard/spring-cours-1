package com.company.invoise;

import com.company.invoise.controller.InvoiceControllerInterface;
import com.company.invoise.controller.InvoiceDouchetteController;
import com.company.invoise.controller.InvoiceKeyBoardController;
import com.company.invoise.controller.InvoiceWebController;
import com.company.invoise.repository.InvoiceDataBaseRepository;
import com.company.invoise.repository.InvoiceRepositoryMemory;
import com.company.invoise.repository.InvoiceRepositoryInterface;
import com.company.invoise.services.InvoiceServiceInterface;
import com.company.invoise.services.InvoiceServiceNumber;
import com.company.invoise.services.InvoiceServicePrefix;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est la class controller que vous voulez  ?");
        String controller = scanner.nextLine();
        System.out.println("Quel est la class service que vous voulez  ?");
        String service = scanner.nextLine();
        System.out.println("Quel est la class repository que vous voulez ?");
        String repo = scanner.nextLine();

        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null;
        InvoiceRepositoryInterface invoiceRepositoryInterface = null;

        invoiceController = (InvoiceControllerInterface) Class.forName(controller).getDeclaredConstructor().newInstance();
        invoiceService = (InvoiceServiceInterface) Class.forName(service).getDeclaredConstructor().newInstance();
        invoiceRepositoryInterface = (InvoiceRepositoryInterface) Class.forName(repo).getDeclaredConstructor().newInstance();

        invoiceController.setInvoiceServiceInterface(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepositoryInterface);

        invoiceController.createInvoice();

    }
}
