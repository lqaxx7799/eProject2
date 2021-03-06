/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import app.App;
import javax.swing.JPanel;
import models.Account;
import services.AccountService;
import utils.CommonUltilities;
import views.ChangePasswordView;

/**
 *
 * @author Admin
 */
public class ChangePasswordController implements BaseController{
    
    private ChangePasswordView changePasswordView;
    private AccountService accountService;
    
    public ChangePasswordController() {
        changePasswordView = new ChangePasswordView();
        accountService = new AccountService();
        
        changePasswordView.getBtnSubmit().addActionListener(e -> changePasswordHandler());
    }

    @Override
    public JPanel getPanel() {
        return changePasswordView;
    }

    @Override
    public void loadData() {
        changePasswordView.getLblSuccess().setText("");
        changePasswordView.getLblErrOldPassword().setText("");
        changePasswordView.getLblErrNewPassword().setText("");
        changePasswordView.getLblErrReenterNewPassword().setText("");
        changePasswordView.getTxtOldPassword().setText("");
        changePasswordView.getTxtNewPassword().setText("");
        changePasswordView.getTxtReenterNewPassword().setText("");
    }
    
    private void changePasswordHandler() {
        String oldPassword = changePasswordView.getTxtOldPassword().getText();
        String newPassword = changePasswordView.getTxtNewPassword().getText();
        String reenterNewPassword = changePasswordView.getTxtReenterNewPassword().getText();
        
        changePasswordView.getLblErrOldPassword().setText("");
        changePasswordView.getLblErrNewPassword().setText("");
        changePasswordView.getLblErrReenterNewPassword().setText("");
        
        boolean isValid = true;
        
        if (oldPassword.equals("")) {
            isValid = false;
            changePasswordView.getLblErrOldPassword().setText("C???n nh???p m???t kh???u c??");
        } else if (!CommonUltilities.generateSHA1(oldPassword).equals(App.currentAccount.getPassword())) {
            isValid = false;
            changePasswordView.getLblErrOldPassword().setText("M???t kh???u c?? kh??ng ????ng");
        }
        
        if (newPassword.equals("")) {
            isValid = false;
            changePasswordView.getLblErrNewPassword().setText("C???n nh???p m???t kh???u m???i");
        }
        
        if (reenterNewPassword.equals("")) {
            isValid = false;
            changePasswordView.getLblErrReenterNewPassword().setText("C???n nh???p l???i m???t kh???u m???i");
        } else if (!reenterNewPassword.equals(newPassword)) {
            isValid = false;
            changePasswordView.getLblErrReenterNewPassword().setText("Nh???p l???i m???t kh???u m???i kh??ng tr??ng");
        }
        
        if (isValid) {
            Account account = App.currentAccount;
            account.setPassword(CommonUltilities.generateSHA1(newPassword));
//            accountService.updatePassword(account.getId(), account.getPassword());
            accountService.update(account);
            App.currentAccount = account;
            changePasswordView.getLblSuccess().setText("Thay ?????i m???t kh???u th??nh c??ng");
            changePasswordView.getTxtOldPassword().setText("");
            changePasswordView.getTxtNewPassword().setText("");
            changePasswordView.getTxtReenterNewPassword().setText("");
            
        }
    }
    
}
