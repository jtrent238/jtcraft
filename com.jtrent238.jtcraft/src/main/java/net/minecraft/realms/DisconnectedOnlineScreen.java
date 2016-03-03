/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import fj;
/*    */ import java.util.List;
/*    */ 
/*    */ public class DisconnectedOnlineScreen extends RealmsScreen
/*    */ {
/*    */   private String title;
/*    */   private fj reason;
/*    */   private List lines;
/*    */   private final RealmsScreen parent;
/*    */   
/*    */   public DisconnectedOnlineScreen(RealmsScreen paramRealmsScreen, String paramString, fj paramfj)
/*    */   {
/* 15 */     this.parent = paramRealmsScreen;
/* 16 */     this.title = getLocalizedString(paramString);
/* 17 */     this.reason = paramfj;
/*    */   }
/*    */   
/*    */   public void init()
/*    */   {
/* 22 */     buttonsClear();
/* 23 */     buttonsAdd(newButton(0, width() / 2 - 100, height() / 4 + 120 + 12, getLocalizedString("gui.back")));
/*    */     
/* 25 */     this.lines = fontSplit(this.reason.d(), width() - 50);
/*    */   }
/*    */   
/*    */   public void keyPressed(char paramChar, int paramInt)
/*    */   {
/* 30 */     if (paramInt == 1) {
/* 31 */       Realms.setScreen(this.parent);
/*    */     }
/*    */   }
/*    */   
/*    */   public void buttonClicked(RealmsButton paramRealmsButton)
/*    */   {
/* 37 */     if (paramRealmsButton.id() == 0) {
/* 38 */       Realms.setScreen(this.parent);
/*    */     }
/*    */   }
/*    */   
/*    */   public void render(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 44 */     renderBackground();
/*    */     
/* 46 */     drawCenteredString(this.title, width() / 2, height() / 2 - 50, 11184810);
/*    */     
/* 48 */     int i = height() / 2 - 30;
/*    */     
/* 50 */     if (this.lines != null) {
/* 51 */       for (String str : this.lines) {
/* 52 */         drawCenteredString(str, width() / 2, i, 16777215);
/* 53 */         i += fontLineHeight();
/*    */       }
/*    */     }
/*    */     
/* 57 */     super.render(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\DisconnectedOnlineScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */