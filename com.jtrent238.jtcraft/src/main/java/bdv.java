/*    */ import java.util.List;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdv
/*    */   extends bdw
/*    */ {
/*    */   private bdw a;
/*    */   private bcd f;
/*    */   private final String g;
/*    */   
/*    */   public bdv(bdw parambdw, String paramString)
/*    */   {
/* 16 */     this.a = parambdw;
/* 17 */     this.g = paramString;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 22 */     this.f.a();
/*    */   }
/*    */   
/*    */ 
/*    */   public void b()
/*    */   {
/* 28 */     Keyboard.enableRepeatEvents(true);
/* 29 */     this.n.clear();
/* 30 */     this.n.add(new bcb(0, this.l / 2 - 100, this.m / 4 + 96 + 12, brp.a("selectWorld.renameButton", new Object[0])));
/* 31 */     this.n.add(new bcb(1, this.l / 2 - 100, this.m / 4 + 120 + 12, brp.a("gui.cancel", new Object[0])));
/*    */     
/* 33 */     aze localaze = this.k.d();
/* 34 */     ays localays = localaze.c(this.g);
/* 35 */     String str = localays.k();
/*    */     
/* 37 */     this.f = new bcd(this.q, this.l / 2 - 100, 60, 200, 20);
/* 38 */     this.f.b(true);
/* 39 */     this.f.a(str);
/*    */   }
/*    */   
/*    */   public void m()
/*    */   {
/* 44 */     Keyboard.enableRepeatEvents(false);
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 49 */     if (!parambcb.l) return;
/* 50 */     if (parambcb.k == 1) {
/* 51 */       this.k.a(this.a);
/* 52 */     } else if (parambcb.k == 0)
/*    */     {
/* 54 */       aze localaze = this.k.d();
/* 55 */       localaze.a(this.g, this.f.b().trim());
/*    */       
/* 57 */       this.k.a(this.a);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(char paramChar, int paramInt)
/*    */   {
/* 63 */     this.f.a(paramChar, paramInt);
/* 64 */     ((bcb)this.n.get(0)).l = (this.f.b().trim().length() > 0);
/*    */     
/* 66 */     if ((paramInt == 28) || (paramInt == 156)) {
/* 67 */       a((bcb)this.n.get(0));
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 73 */     super.a(paramInt1, paramInt2, paramInt3);
/*    */     
/* 75 */     this.f.a(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 81 */     c();
/*    */     
/* 83 */     a(this.q, brp.a("selectWorld.renameTitle", new Object[0]), this.l / 2, 20, 16777215);
/* 84 */     b(this.q, brp.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, 10526880);
/*    */     
/* 86 */     this.f.f();
/*    */     
/* 88 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */