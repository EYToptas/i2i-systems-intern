DECLARE
  v_string    VARCHAR2(30) := 'abbcddfggfca'; 
  v_char      VARCHAR2(1);
  v_output    VARCHAR2(4000) := '';
  v_level     NUMBER;
BEGIN
  
  IF LENGTH(v_string) > 30 THEN
    DBMS_OUTPUT.PUT_LINE('Error: String too long.');
    RETURN;
  END IF;

  FOR i IN 1 .. LENGTH(v_string) LOOP
    v_char := SUBSTR(v_string, i, 1);

   
    IF v_char NOT BETWEEN 'a' AND 'z' THEN
      DBMS_OUTPUT.PUT_LINE('Error: Invalid character "' || v_char || '". Only lowercase letters allowed.');
      RETURN;
    END IF;

   
    v_level := ASCII(v_char) - ASCII('a');

    v_output := v_output || RPAD(' ', v_level * 2, ' ') || v_char || CHR(10);
  END LOOP;

  -- Sonuç
  DBMS_OUTPUT.PUT_LINE('String: ' || v_string);
  DBMS_OUTPUT.PUT_LINE(v_output);
END;
