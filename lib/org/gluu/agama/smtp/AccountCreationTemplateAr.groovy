package org.gluu.agama.smtp;

import java.util.Map;

class AccountCreationTemplateAr {

    static Map<String, String> get(String userName) {

        String html = """
<table role="presentation" cellspacing="0" cellpadding="0" width="100%" style="background-color:#F2F4F6;margin:0;padding:0;width:100%;">
  <tbody>
    <tr>
      <td align="center">
        <table role="presentation" cellspacing="0" cellpadding="0" width="100%" style="margin:0;padding:0;">
          <tbody>
            <!-- Logo -->
            <tr>
              <td align="center" style="padding:25px 0;text-align:center;">
                <img src="https://storage.googleapis.com/email_template_staticfiles/Phi_logo320x132_Aug2024.png" width="160" alt="Phi Logo" style="border:none;">
              </td>
            </tr>

            <!-- Main Email Body -->
            <tr>
              <td style="width:100%;margin:0;padding:0;">
                <table role="presentation" dir="rtl" cellspacing="0" cellpadding="0" width="570" align="center" style="background-color:#FFFFFF;margin:0 auto;padding:0;border-radius:4px;">
                  <tbody>
                    <tr>
                      <td style="padding:45px;font-family:'Nunito Sans',Helvetica,Arial,sans-serif;color:#51545E;font-size:16px;line-height:1.8;text-align:right;">
                        <p>ÙØ±Ø­Ø¨Ø§ÙØ</p>
                        <p>Ø£ÙÙØ§Ù Ø¨Ù ÙÙ <strong>ÙØ§Ù ÙØ§ÙØª (Phi Wallet)</strong>! âØ±Ø­ÙØªÙ ÙØ­Ù Ø­ÙØ§ÙØ© ÙØ³ØªÙØ¨ÙÙ Ø§ÙÙØ§ÙÙ ØªØ¨Ø¯Ø£ Ø§ÙØ¢Ù.</p>

                        <p><strong>ØªÙØ§ØµÙÙ Ø­Ø³Ø§Ø¨Ù:</strong></p>
                        <div style="text-align:center;margin:30px 0;">
                          <div style="display:inline-block;background-color:#f5f5f5;color:#AD9269;font-size:28px;font-weight:600;letter-spacing:2px;padding:10px 20px;border-radius:4px;">
                            """ + userName + """
                          </div>
                        </div>

                        <p><strong>Ø§ÙØ®Ø·ÙØ© Ø§ÙØªØ§ÙÙØ©: ââØ§ÙØªØ­ÙÙ ÙÙ ÙÙÙØªÙ</strong></p>
                        <p>ÙØ¶ÙØ§Ù Ø¨ÙØ§Ø¡ Ø°ÙØ¨Ù ØªØ­Øª Ø³ÙØ·Ø±ØªÙ Ø§ÙØ­ØµØ±ÙØ©Ø ÙØ­ØªØ§Ø¬ Ø¥ÙÙ Ø§ÙØªØ­ÙÙ ÙÙ ÙÙÙØªÙ. ÙØ­ÙÙ ÙØ°Ø§ Ø§ÙØ¥Ø¬Ø±Ø§Ø¡ Ø§ÙØ£ÙÙÙ Ø°ÙØ¨Ù ÙÙÙÙØ­Ù Ø­ÙÙÙ Ø§ÙÙÙÙÙØ© Ø§ÙÙØ§ÙÙØ©.</p>

                        <div style="text-align:center;margin:30px 0;">
                          <a href="https://link.phiwallet.com/vll3ylhkeqb" style="background-color:#AD9269;color:#ffffff;padding:14px 28px;text-decoration:none;border-radius:4px;font-weight:600;display:inline-block;">
                            Ø§ÙØªØ­ Ø§ÙØªØ·Ø¨ÙÙ
                          </a>
                        </div>

                        <p>Ø¥Ø°Ø§ ÙØ§ÙØª ÙØ¯ÙÙ Ø£Ù Ø£Ø³Ø¦ÙØ©Ø ÙØ³Ø¹Ø¯ÙØ§ Ø¯Ø§Ø¦ÙØ§Ù ÙØ³Ø§Ø¹Ø¯ØªÙ. Ø´ÙØ±Ø§Ù ÙØ§Ø®ØªÙØ§Ø±Ù ÙØ§Ù ÙØ§ÙØª!</p>

                        <p style="margin-top:30px;">ÙØ¹ Ø£Ø·ÙØ¨ Ø§ÙØªØ­ÙØ§ØªØ<br>ÙØ±ÙÙ ÙØ§Ù ÙØ§ÙØª</p>

                      </td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>

            <!-- Footer -->
            <tr>
              <td>
                <table role="presentation" cellspacing="0" cellpadding="0" width="570" align="center" style="margin:0 auto;padding:0;text-align:center;">
                  <tbody>
                    <tr>
                      <td style="padding:20px;font-size:12px;color:#666;">
                        <p style="margin:0 0 10px 0;font-size:14px;font-weight:bold;color:#565555;">ØªØ§Ø¨Ø¹ÙØ§ Ø¹ÙÙ:</p>
                        <p>
                          <a href="https://www.facebook.com/PhiWallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/facebook.png" style="height:20px;"></a>
                          <a href="https://x.com/PhiWallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/twitter.png" style="height:20px;"></a>
                          <a href="https://www.instagram.com/phi.wallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/instagram.png" style="height:20px;"></a>
                          <a href="https://www.linkedin.com/company/phiwallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/linkedin.png" style="height:20px;"></a>
                        </p>
                        <p style="margin-top:10px;line-height:20px;color:#A8AAAF;font-size:12px;">
                          Phi Wallet Unipessoal LDA<br>
                          Avenida da Liberdade 262 R/C<br>
                          1250-149 Lisbon<br>
                          Portugal
                        </p>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>
            
          </tbody>
        </table>
      </td>
    </tr>
  </tbody>
</table>
""";

        return Map.of(
            "subject", "ÙØ±Ø­Ø¨Ø§Ù Ø¨Ù ÙÙ Phi Wallet",
            "body", html
        );
    }
}
