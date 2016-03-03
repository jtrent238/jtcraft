/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bad
/*     */   extends ayl
/*     */ {
/*  13 */   private static final Logger a = ;
/*     */   
/*     */   private bac b;
/*     */   private dh c;
/*     */   
/*     */   public bad()
/*     */   {
/*  20 */     this("scoreboard");
/*     */   }
/*     */   
/*     */   public bad(String paramString) {
/*  24 */     super(paramString);
/*     */   }
/*     */   
/*     */   public void a(bac parambac) {
/*  28 */     this.b = parambac;
/*     */     
/*  30 */     if (this.c != null) {
/*  31 */       a(this.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  37 */     if (this.b == null) {
/*  38 */       this.c = paramdh;
/*  39 */       return;
/*     */     }
/*     */     
/*  42 */     b(paramdh.c("Objectives", 10));
/*  43 */     c(paramdh.c("PlayerScores", 10));
/*     */     
/*  45 */     if (paramdh.b("DisplaySlots", 10)) {
/*  46 */       c(paramdh.m("DisplaySlots"));
/*     */     }
/*     */     
/*  49 */     if (paramdh.b("Teams", 9)) {
/*  50 */       a(paramdh.c("Teams", 10));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(dq paramdq) {
/*  55 */     for (int i = 0; i < paramdq.c(); i++) {
/*  56 */       dh localdh = paramdq.b(i);
/*     */       
/*  58 */       azy localazy = this.b.f(localdh.j("Name"));
/*  59 */       localazy.a(localdh.j("DisplayName"));
/*  60 */       localazy.b(localdh.j("Prefix"));
/*  61 */       localazy.c(localdh.j("Suffix"));
/*  62 */       if (localdh.b("AllowFriendlyFire", 99)) localazy.a(localdh.n("AllowFriendlyFire"));
/*  63 */       if (localdh.b("SeeFriendlyInvisibles", 99)) { localazy.b(localdh.n("SeeFriendlyInvisibles"));
/*     */       }
/*  65 */       a(localazy, localdh.c("Players", 8));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(azy paramazy, dq paramdq) {
/*  70 */     for (int i = 0; i < paramdq.c(); i++) {
/*  71 */       this.b.a(paramdq.f(i), paramazy.b());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(dh paramdh) {
/*  76 */     for (int i = 0; i < 3; i++) {
/*  77 */       if (paramdh.b("slot_" + i, 8)) {
/*  78 */         String str = paramdh.j("slot_" + i);
/*  79 */         azx localazx = this.b.b(str);
/*  80 */         this.b.a(i, localazx);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(dq paramdq) {
/*  86 */     for (int i = 0; i < paramdq.c(); i++) {
/*  87 */       dh localdh = paramdq.b(i);
/*     */       
/*  89 */       bah localbah = (bah)bah.a.get(localdh.j("CriteriaName"));
/*  90 */       azx localazx = this.b.a(localdh.j("Name"), localbah);
/*  91 */       localazx.a(localdh.j("DisplayName"));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(dq paramdq) {
/*  96 */     for (int i = 0; i < paramdq.c(); i++) {
/*  97 */       dh localdh = paramdq.b(i);
/*     */       
/*  99 */       azx localazx = this.b.b(localdh.j("Objective"));
/* 100 */       azz localazz = this.b.a(localdh.j("Name"), localazx);
/* 101 */       localazz.c(localdh.f("Score"));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 107 */     if (this.b == null) {
/* 108 */       a.warn("Tried to save scoreboard without having a scoreboard...");
/* 109 */       return;
/*     */     }
/*     */     
/* 112 */     paramdh.a("Objectives", b());
/* 113 */     paramdh.a("PlayerScores", e());
/* 114 */     paramdh.a("Teams", a());
/*     */     
/* 116 */     d(paramdh);
/*     */   }
/*     */   
/*     */   protected dq a() {
/* 120 */     dq localdq1 = new dq();
/* 121 */     Collection localCollection = this.b.g();
/*     */     
/* 123 */     for (azy localazy : localCollection) {
/* 124 */       dh localdh = new dh();
/*     */       
/* 126 */       localdh.a("Name", localazy.b());
/* 127 */       localdh.a("DisplayName", localazy.c());
/* 128 */       localdh.a("Prefix", localazy.e());
/* 129 */       localdh.a("Suffix", localazy.f());
/* 130 */       localdh.a("AllowFriendlyFire", localazy.g());
/* 131 */       localdh.a("SeeFriendlyInvisibles", localazy.h());
/*     */       
/* 133 */       dq localdq2 = new dq();
/*     */       
/* 135 */       for (String str : localazy.d()) {
/* 136 */         localdq2.a(new dx(str));
/*     */       }
/*     */       
/* 139 */       localdh.a("Players", localdq2);
/*     */       
/* 141 */       localdq1.a(localdh);
/*     */     }
/*     */     
/* 144 */     return localdq1;
/*     */   }
/*     */   
/*     */   protected void d(dh paramdh) {
/* 148 */     dh localdh = new dh();
/* 149 */     int i = 0;
/*     */     
/* 151 */     for (int j = 0; j < 3; j++) {
/* 152 */       azx localazx = this.b.a(j);
/*     */       
/* 154 */       if (localazx != null) {
/* 155 */         localdh.a("slot_" + j, localazx.b());
/* 156 */         i = 1;
/*     */       }
/*     */     }
/*     */     
/* 160 */     if (i != 0) paramdh.a("DisplaySlots", localdh);
/*     */   }
/*     */   
/*     */   protected dq b() {
/* 164 */     dq localdq = new dq();
/* 165 */     Collection localCollection = this.b.c();
/*     */     
/* 167 */     for (azx localazx : localCollection) {
/* 168 */       dh localdh = new dh();
/*     */       
/* 170 */       localdh.a("Name", localazx.b());
/* 171 */       localdh.a("CriteriaName", localazx.c().a());
/* 172 */       localdh.a("DisplayName", localazx.d());
/*     */       
/* 174 */       localdq.a(localdh);
/*     */     }
/*     */     
/* 177 */     return localdq;
/*     */   }
/*     */   
/*     */   protected dq e() {
/* 181 */     dq localdq = new dq();
/* 182 */     Collection localCollection = this.b.e();
/*     */     
/* 184 */     for (azz localazz : localCollection) {
/* 185 */       dh localdh = new dh();
/*     */       
/* 187 */       localdh.a("Name", localazz.e());
/* 188 */       localdh.a("Objective", localazz.d().b());
/* 189 */       localdh.a("Score", localazz.c());
/*     */       
/* 191 */       localdq.a(localdh);
/*     */     }
/*     */     
/* 194 */     return localdq;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */