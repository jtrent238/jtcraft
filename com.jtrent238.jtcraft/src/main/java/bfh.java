/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bfh
/*     */   extends bdw
/*     */ {
/*  17 */   private static final Logger a = ;
/*     */   private bcd f;
/*     */   private bcd g;
/*     */   private final agp h;
/*     */   private bcb i;
/*     */   private bcb r;
/*     */   
/*     */   public bfh(agp paramagp) {
/*  25 */     this.h = paramagp;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  30 */     this.f.a();
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  35 */     Keyboard.enableRepeatEvents(true);
/*  36 */     this.n.clear();
/*  37 */     this.n.add(this.i = new bcb(0, this.l / 2 - 4 - 150, this.m / 4 + 120 + 12, 150, 20, brp.a("gui.done", new Object[0])));
/*  38 */     this.n.add(this.r = new bcb(1, this.l / 2 + 4, this.m / 4 + 120 + 12, 150, 20, brp.a("gui.cancel", new Object[0])));
/*     */     
/*  40 */     this.f = new bcd(this.q, this.l / 2 - 150, 50, 300, 20);
/*  41 */     this.f.f(32767);
/*  42 */     this.f.b(true);
/*  43 */     this.f.a(this.h.i());
/*     */     
/*  45 */     this.g = new bcd(this.q, this.l / 2 - 150, 135, 300, 20);
/*  46 */     this.g.f(32767);
/*  47 */     this.g.c(false);
/*  48 */     this.g.a(this.h.i());
/*     */     
/*  50 */     if (this.h.h() != null) {
/*  51 */       this.g.a(this.h.h().c());
/*     */     }
/*     */     
/*  54 */     this.i.l = (this.f.b().trim().length() > 0);
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/*  59 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  64 */     if (!parambcb.l) return;
/*  65 */     if (parambcb.k == 1) {
/*  66 */       this.k.a(null);
/*  67 */     } else if (parambcb.k == 0) {
/*  68 */       et localet = new et(Unpooled.buffer());
/*     */       try
/*     */       {
/*  71 */         localet.writeByte(this.h.f());
/*  72 */         this.h.a(localet);
/*  73 */         localet.a(this.f.b());
/*  74 */         this.k.v().a(new iz("MC|AdvCdm", localet));
/*     */       } catch (Exception localException) {
/*  76 */         a.error("Couldn't send command block info", localException);
/*     */       } finally {
/*  78 */         localet.release();
/*     */       }
/*     */       
/*  81 */       this.k.a(null);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  87 */     this.f.a(paramChar, paramInt);
/*  88 */     this.g.a(paramChar, paramInt);
/*  89 */     this.i.l = (this.f.b().trim().length() > 0);
/*     */     
/*  91 */     if ((paramInt == 28) || (paramInt == 156)) {
/*  92 */       a(this.i);
/*  93 */     } else if (paramInt == 1) {
/*  94 */       a(this.r);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 100 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */     
/* 102 */     this.f.a(paramInt1, paramInt2, paramInt3);
/* 103 */     this.g.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 108 */     c();
/*     */     
/* 110 */     a(this.q, brp.a("advMode.setCommand", new Object[0]), this.l / 2, 20, 16777215);
/* 111 */     b(this.q, brp.a("advMode.command", new Object[0]), this.l / 2 - 150, 37, 10526880);
/* 112 */     this.f.f();
/*     */     
/* 114 */     int j = 75;
/* 115 */     int k = 0;
/*     */     
/* 117 */     b(this.q, brp.a("advMode.nearestPlayer", new Object[0]), this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/* 118 */     b(this.q, brp.a("advMode.randomPlayer", new Object[0]), this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/* 119 */     b(this.q, brp.a("advMode.allPlayers", new Object[0]), this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/*     */     
/* 121 */     if (this.g.b().length() > 0) {
/* 122 */       j += k * this.q.a + 20;
/* 123 */       b(this.q, brp.a("advMode.previousOutput", new Object[0]), this.l / 2 - 150, j, 10526880);
/* 124 */       this.g.f();
/*     */     }
/*     */     
/* 127 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */