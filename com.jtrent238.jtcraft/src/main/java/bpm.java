/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum bpm
/*     */ {
/*     */   private final String c;
/*     */   private final String d;
/*     */   private final int e;
/*  86 */   private final Map f = Maps.newHashMap();
/*     */   
/*     */   private bpm(String paramString2, String paramString3, int paramInt1) {
/*  89 */     this.c = paramString2;
/*  90 */     this.d = paramString3;
/*  91 */     this.e = paramInt1;
/*     */   }
/*     */   
/*     */   public String a() {
/*  95 */     return this.c;
/*     */   }
/*     */   
/*     */   protected String b() {
/*  99 */     return this.d;
/*     */   }
/*     */   
/*     */   protected int c() {
/* 103 */     return this.e;
/*     */   }
/*     */   
/*     */   protected Map d() {
/* 107 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */