/*    */ import java.util.List;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bde
/*    */   extends bdw
/*    */ {
/*    */   private final bdw a;
/*    */   private final bjn f;
/*    */   private bcd g;
/*    */   
/*    */   public bde(bdw parambdw, bjn parambjn)
/*    */   {
/* 15 */     this.a = parambdw;
/* 16 */     this.f = parambjn;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 21 */     this.g.a();
/*    */   }
/*    */   
/*    */ 
/*    */   public void b()
/*    */   {
/* 27 */     Keyboard.enableRepeatEvents(true);
/* 28 */     this.n.clear();
/* 29 */     this.n.add(new bcb(0, this.l / 2 - 100, this.m / 4 + 96 + 12, brp.a("selectServer.select", new Object[0])));
/* 30 */     this.n.add(new bcb(1, this.l / 2 - 100, this.m / 4 + 120 + 12, brp.a("gui.cancel", new Object[0])));
/*    */     
/* 32 */     this.g = new bcd(this.q, this.l / 2 - 100, 116, 200, 20);
/* 33 */     this.g.f(128);
/* 34 */     this.g.b(true);
/* 35 */     this.g.a(this.k.u.az);
/*    */     
/* 37 */     ((bcb)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0));
/*    */   }
/*    */   
/*    */   public void m()
/*    */   {
/* 42 */     Keyboard.enableRepeatEvents(false);
/* 43 */     this.k.u.az = this.g.b();
/* 44 */     this.k.u.b();
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 49 */     if (!parambcb.l) return;
/* 50 */     if (parambcb.k == 1) {
/* 51 */       this.a.a(false, 0);
/* 52 */     } else if (parambcb.k == 0) {
/* 53 */       this.f.b = this.g.b();
/* 54 */       this.a.a(true, 0);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(char paramChar, int paramInt)
/*    */   {
/* 60 */     if (this.g.a(paramChar, paramInt)) {
/* 61 */       ((bcb)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0));
/* 62 */     } else if ((paramInt == 28) || (paramInt == 156)) {
/* 63 */       a((bcb)this.n.get(0));
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 69 */     super.a(paramInt1, paramInt2, paramInt3);
/*    */     
/* 71 */     this.g.a(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 77 */     c();
/*    */     
/* 79 */     a(this.q, brp.a("selectServer.direct", new Object[0]), this.l / 2, 20, 16777215);
/* 80 */     b(this.q, brp.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 100, 10526880);
/*    */     
/* 82 */     this.g.f();
/*    */     
/* 84 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */