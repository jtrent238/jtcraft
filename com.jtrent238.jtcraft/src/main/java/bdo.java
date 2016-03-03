/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdo
/*    */   extends bdw
/*    */ {
/*    */   public void b()
/*    */   {
/* 12 */     this.n.clear();
/* 13 */     this.n.add(new bcj(0, this.l / 2 - 155, this.m / 4 + 120 + 12, brp.a("gui.toMenu", new Object[0])));
/* 14 */     this.n.add(new bcj(1, this.l / 2 - 155 + 160, this.m / 4 + 120 + 12, brp.a("menu.quit", new Object[0])));
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 19 */     if (parambcb.k == 0) {
/* 20 */       this.k.a(new bee());
/* 21 */     } else if (parambcb.k == 1) {
/* 22 */       this.k.k();
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   protected void a(char paramChar, int paramInt) {}
/*    */   
/*    */ 
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 32 */     c();
/*    */     
/* 34 */     a(this.q, "Out of memory!", this.l / 2, this.m / 4 - 60 + 20, 16777215);
/* 35 */     b(this.q, "Minecraft has run out of memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 0, 10526880);
/* 36 */     b(this.q, "This could be caused by a bug in the game or by the", this.l / 2 - 140, this.m / 4 - 60 + 60 + 18, 10526880);
/* 37 */     b(this.q, "Java Virtual Machine not being allocated enough", this.l / 2 - 140, this.m / 4 - 60 + 60 + 27, 10526880);
/* 38 */     b(this.q, "memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 36, 10526880);
/* 39 */     b(this.q, "To prevent level corruption, the current game has quit.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 54, 10526880);
/* 40 */     b(this.q, "We've tried to free up enough memory to let you go back to", this.l / 2 - 140, this.m / 4 - 60 + 60 + 63, 10526880);
/* 41 */     b(this.q, "the main menu and back to playing, but this may not have worked.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 72, 10526880);
/* 42 */     b(this.q, "Please restart the game if you see this message again.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 81, 10526880);
/*    */     
/* 44 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */