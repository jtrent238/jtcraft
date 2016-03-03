/*     */ import java.util.List;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdg
/*     */   extends bdw
/*     */ {
/*     */   private final bdw a;
/*     */   private final bjn f;
/*     */   private bcd g;
/*     */   private bcd h;
/*     */   private bcb i;
/*     */   
/*     */   public bdg(bdw parambdw, bjn parambjn)
/*     */   {
/*  17 */     this.a = parambdw;
/*  18 */     this.f = parambjn;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  23 */     this.h.a();
/*  24 */     this.g.a();
/*     */   }
/*     */   
/*     */ 
/*     */   public void b()
/*     */   {
/*  30 */     Keyboard.enableRepeatEvents(true);
/*  31 */     this.n.clear();
/*  32 */     this.n.add(new bcb(0, this.l / 2 - 100, this.m / 4 + 96 + 18, brp.a("addServer.add", new Object[0])));
/*  33 */     this.n.add(new bcb(1, this.l / 2 - 100, this.m / 4 + 120 + 18, brp.a("gui.cancel", new Object[0])));
/*  34 */     this.n.add(this.i = new bcb(2, this.l / 2 - 100, this.m / 4 + 72, brp.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d()));
/*     */     
/*  36 */     this.h = new bcd(this.q, this.l / 2 - 100, 66, 200, 20);
/*  37 */     this.h.b(true);
/*  38 */     this.h.a(this.f.a);
/*     */     
/*  40 */     this.g = new bcd(this.q, this.l / 2 - 100, 106, 200, 20);
/*  41 */     this.g.f(128);
/*  42 */     this.g.a(this.f.b);
/*     */     
/*  44 */     ((bcb)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0) && (this.h.b().length() > 0));
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/*  49 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  54 */     if (!parambcb.l) return;
/*  55 */     if (parambcb.k == 2) {
/*  56 */       this.f.a(bjo.values()[((this.f.b().ordinal() + 1) % bjo.values().length)]);
/*  57 */       this.i.j = (brp.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d());
/*  58 */     } else if (parambcb.k == 1) {
/*  59 */       this.a.a(false, 0);
/*  60 */     } else if (parambcb.k == 0) {
/*  61 */       this.f.a = this.h.b();
/*  62 */       this.f.b = this.g.b();
/*  63 */       this.a.a(true, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  69 */     this.h.a(paramChar, paramInt);
/*  70 */     this.g.a(paramChar, paramInt);
/*     */     
/*  72 */     if (paramInt == 15) {
/*  73 */       this.h.b(!this.h.l());
/*  74 */       this.g.b(!this.g.l());
/*     */     }
/*  76 */     if ((paramInt == 28) || (paramInt == 156)) {
/*  77 */       a((bcb)this.n.get(0));
/*     */     }
/*  79 */     ((bcb)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0) && (this.h.b().length() > 0));
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  84 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */     
/*  86 */     this.g.a(paramInt1, paramInt2, paramInt3);
/*  87 */     this.h.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/*  93 */     c();
/*     */     
/*  95 */     a(this.q, brp.a("addServer.title", new Object[0]), this.l / 2, 17, 16777215);
/*  96 */     b(this.q, brp.a("addServer.enterName", new Object[0]), this.l / 2 - 100, 53, 10526880);
/*  97 */     b(this.q, brp.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 94, 10526880);
/*     */     
/*  99 */     this.h.f();
/* 100 */     this.g.f();
/*     */     
/* 102 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */